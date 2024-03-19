package br.edu.infnet.joseaugustorosa.model.domain;

public class Contrato {
	private String Nome;
	private String CPF;
	private float Salario;
	private String Cargo;
	
	
	public float salarioLiquido() {
		float salarioLiquido ;
		if (Salario >=  6750) {
			salarioLiquido = Salario - 1500;
			
		}else {
			salarioLiquido = Salario - 300;
		}
		
		return salarioLiquido;
	}
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public float getSalario() {
		return Salario;
	}
	public void setSalario(float salario) {
		Salario = salario;
	}
	public String getCargo() {
		return Cargo;
	}
	public void setCargo(String cargo) {
		Cargo = cargo;
	}

}
