package br.com.wtsyst.ws.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.wtsyst.bean.Aluno;
import br.com.wtsyst.controle.AlunoBCI;

@RestController
public class AlunoRestController {

	@Autowired
	private AlunoBCI controle;
	

	@GetMapping("/consultar_alunos")
	public List<Aluno> getCustomers() {
		return controle.select();
	}

}
