package br.com.wtsyst.ws.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import br.com.wtsyst.bean.Aluno;
import br.com.wtsyst.controle.AlunoBCI;

@RestController
public class AlunoRestController {

	@Autowired
	private AlunoBCI controle;
	
	@PostMapping(value = "/cadastrar_aluno")
	public ResponseEntity cadastrarAlunos(@RequestBody Aluno aluno) {
		this.controle.insert(aluno);
		
		return new ResponseEntity(aluno, HttpStatus.OK);
	}
	
	@GetMapping("/consultar_aluno")
	public List<Aluno> getCustomers() {
		return controle.select();
	}
	

}
