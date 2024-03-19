package br.edu.infnet.joseaugustorosa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.joseaugustorosa.model.domain.Contrato;

@SpringBootTest
class JoseaugustorosaApplicationTests {

	@Test
	void contextLoads() {
		
	}
	@Test
	void SalarioLiquidoBaixo() {
		Contrato func1 = new Contrato();
		
		func1.setNome("José Augusto");
		func1.setCPF("000.000.000-00");
		func1.setCargo("Desenvolvedor");
		func1.setSalario(5000);
		
		assertEquals(4700.0, func1.salarioLiquido());
		
	}
	@Test
	void SalarioLiquidoAlto() {
		Contrato func1 = new Contrato();
		
		func1.setNome("José Augusto");
		func1.setCPF("000.000.000-00");
		func1.setCargo("Desenvolvedor");
		func1.setSalario(10000);
		//func1.salarioLiquido();
		assertEquals(8500, func1.salarioLiquido());
	}

}
