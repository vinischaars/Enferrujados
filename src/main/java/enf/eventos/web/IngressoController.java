package enf.eventos.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import enf.eventos.domain.Ingresso;
import enf.eventos.service.IngressoService;

@RestController
@RequestMapping("/ingressos")
public class IngressoController {

	@Autowired
	IngressoService service;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Ingresso>> listar(){
		return new ResponseEntity<>(service.listar(), HttpStatus.OK);
	}	
	
	@RequestMapping(method = RequestMethod.GET, value="/buscar/{id}")
	public ResponseEntity<List<Ingresso>> listaIngressos(@RequestParam(value="id", defaultValue="All") String idIngresso) {
		if(idIngresso.equals("All")) {
			return ResponseEntity.ok(service.listar());
		} else
			return ResponseEntity.ok(service.findById(idIngresso));
	}
	
}
