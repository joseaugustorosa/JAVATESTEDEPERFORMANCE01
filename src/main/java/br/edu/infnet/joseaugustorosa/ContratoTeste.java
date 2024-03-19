package br.edu.infnet.joseaugustorosa;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.joseaugustorosa.model.domain.Contrato;
@Component
public class ContratoTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Contrato func1 = new Contrato();
		
		func1.setNome("José");
		func1.setCPF("000.000.000-00");
		func1.setCargo("Desenvolvedor");
		func1.setSalario(5000);
		System.out.println("Contrato:" + func1.getNome());
		System.out.println("Cargo:" + func1.getCargo());
		System.out.println("Salario Bruto:" + func1.getSalario());
		System.out.println("Salario Líquido:" + func1.salarioLiquido());
		Contrato func2 = new Contrato();
		
		func2.setNome("Nathália");
		func2.setCPF("000.000.000-00");
		func2.setCargo("Desenvolvedora");
		func2.setSalario(15000);
		System.out.println("Contrato:" + func2.getNome());
		System.out.println("Cargo:" + func2.getCargo());
		System.out.println("Salario Bruto:" + func2.getSalario());
		System.out.println("Salario Líquido:" + func2.salarioLiquido());
		
	}
}
