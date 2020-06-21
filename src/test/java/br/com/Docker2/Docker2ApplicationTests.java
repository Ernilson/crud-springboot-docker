package br.com.Docker2;

import br.com.Docker2.Model.Cadastro;
import br.com.Docker2.Repository.CadRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Docker2ApplicationTests {

	@Autowired
	private CadRepository cadRepository;

	@Test
	void contextLoads() {
		Cadastro c = new Cadastro();
		//c.setId_c(1L);
		c.setNome("Ligiane Maria Vieira de Souza");
		c.setFone("555555555");
		c.setEmail("teste@teste");

		cadRepository.save(c);
	}

}
