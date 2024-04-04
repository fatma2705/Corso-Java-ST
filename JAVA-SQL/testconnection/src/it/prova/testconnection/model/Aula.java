package it.prova.testconnection.model;

public class Aula {
	private Long id;
	private int anno;
	private char sezione;
	private int numeroStudenti;
	
	
	
	
	public Aula() {
		
	}




	public Aula(Long id, int anno, char sezione, int numeroStudenti) {
		
		this.id = id;
		this.anno = anno;
		this.sezione = sezione;
		this.numeroStudenti = numeroStudenti;
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public int getAnno() {
		return anno;
	}




	public void setAnno(int anno) {
		this.anno = anno;
	}




	public char getSezione() {
		return sezione;
	}




	public void setSezione(char sezione) {
		this.sezione = sezione;
	}




	public int getNumeroStudenti() {
		return numeroStudenti;
	}




	public void setNumeroStudenti(int numeroStudenti) {
		this.numeroStudenti = numeroStudenti;
	}




	@Override
	public String toString() {
		return "Aula [id=" + id + ", anno=" + anno + ", sezione=" + sezione + ", numeroStudenti=" + numeroStudenti
				+ "]";
	}
	
	
	
	
	
	
	
	

}
