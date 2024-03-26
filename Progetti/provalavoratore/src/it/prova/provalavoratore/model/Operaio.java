package it.prova.provalavoratore.model;

public class Operaio extends Lavoratore {
	private int salario;

	
	
	public Operaio() {
		
	}
	
	
	public Operaio(String nome, String cognome,int salario) {
		super(nome,cognome);
		this.salario = salario;
	}
	
	
	public int getSalario() {
		return this.salario;
	}
	
	public void setSalario(int setSalario) {
		this.salario = setSalario;
	}
	
	
	public String percepisco() {
		return "Io " + super.nome + " " + super.cognome + " percepisco " + this.salario + " £ mensilmente";
	}
}
