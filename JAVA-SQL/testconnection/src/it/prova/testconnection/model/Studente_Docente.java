package it.prova.testconnection.model;

public class Studente_Docente {
	
	private int id_studente_docente;
	private int id_studente;
	private int id_docente;
	
	
		public Studente_Docente() {
			
		}
	
	
	
	public Studente_Docente(int id_studente_docente, int id_studente, int id_docente) {
		
		this.id_studente_docente = id_studente_docente;
		this.id_studente = id_studente;
		this.id_docente = id_docente;
	}



	public int getId_studente_docente() {
		return id_studente_docente;
	}



	public void setId_studente_docente(int id_studente_docente) {
		this.id_studente_docente = id_studente_docente;
	}



	public int getId_studente() {
		return id_studente;
	}



	public void setId_studente(int id_studente) {
		this.id_studente = id_studente;
	}



	public int getId_docente() {
		return id_docente;
	}



	public void setId_docente(int id_docente) {
		this.id_docente = id_docente;
	}



	@Override
	public String toString() {
		return "Studente_Docente [id_studente_docente=" + id_studente_docente + ", id_studente=" + id_studente
				+ ", id_docente=" + id_docente + "]";
	}
	
	
	
	
	
	


	
	
	

}
