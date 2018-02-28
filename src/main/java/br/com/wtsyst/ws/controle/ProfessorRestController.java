package br.com.wtsyst.ws.controle;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.wtsyst.bean.Professor;
import br.com.wtsyst.controle.ProfessorBCI;

@RestController
public class ProfessorRestController {

	@Autowired
	private ProfessorBCI controle;
	
	@GetMapping("/consultar_professor")
	public List<Professor> getCustomers() {
		return controle.select();
	}

}
