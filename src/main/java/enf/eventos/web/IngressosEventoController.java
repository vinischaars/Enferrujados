package enf.eventos.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import enf.eventos.domain.IngressoEvento;
import enf.eventos.service.IngressoEventoService;
import enf.eventos.service.IngressoService;

@RestController
@RequestMapping("/eventos/{idEvento}/ingressos")
public class IngressosEventoController {

	@Autowired
	IngressoEventoService service;
	@Autowired
	IngressoService ingressoService;

	@GetMapping
	public ResponseEntity<List<IngressoEvento>> listarIngressosPorIdDoEvento(@PathVariable int idEvento) {
		return ResponseEntity.ok(service.listarIngressosPorIdDoEvento(idEvento));
	}
	
	@PostMapping
	public ResponseEntity<?> adicionarIngressosEmEventos(@PathVariable Long idEvento, @RequestBody IngressoEvento ingressoEvento){
		ingressoEvento.getEvento().setId(idEvento);
		
		if (ingressoEvento.getIngresso().getTipoIngresso().isEmpty())
			ingressoEvento.setIngresso(ingressoService.buscarPorId(ingressoEvento.getIngresso().getId()));
		
		String validacao = service.validarOperacao(ingressoEvento);
		
		if (!validacao.isEmpty())
			return ResponseEntity.badRequest().body(validacao);
		
//		if (service.encontrarTipoDeIngressoDuplicado(ingressoEvento.getIngresso().getTipoIngresso(),ingressoEvento.getEvento().getId())) {
//			return ResponseEntity.badRequest().body();
//		}
		
		return ResponseEntity.ok(service.adicionarIngressosEmEventos(ingressoEvento));
	}
	
}
