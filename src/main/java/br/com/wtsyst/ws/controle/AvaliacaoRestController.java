package br.com.wtsyst.ws.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.wtsyst.bean.Avaliacao;
import br.com.wtsyst.controle.AvaliacaoBCI;

@RestController
public class AvaliacaoRestController {

	@Autowired
	private AvaliacaoBCI controle;
	

	@GetMapping("/consulta_avaliacao")
	public List<Avaliacao> getCustomers() {
		return controle.select();
	}
}
