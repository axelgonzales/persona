package pe.inkacola.rrhh.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.inkacola.rrhh.domain.Persona;
import pe.inkacola.rrhh.service.PersonaService;

@RestController
@RequestMapping("v1/persona")
public class PersonaController {

	
	@Autowired
	private PersonaService personaService;
	
	
	@GetMapping
	public List<Persona> obtenerPersonas() {
		
		return personaService.listarTodos();
	}
	
	
	@PostMapping
	public ResponseEntity<Persona> registrar( @RequestBody @Valid Persona persona) {
		return new ResponseEntity<Persona>(personaService.registrar(persona),HttpStatus.CREATED);
	}
}
