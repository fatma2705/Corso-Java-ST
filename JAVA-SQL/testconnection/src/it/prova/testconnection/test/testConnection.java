package it.prova.testconnection.test;

import it.prova.testconnection.dao.aula.AulaDaoImpl;

public class testConnection {

	public static void main(String[] args) throws Exception {
		
		
//		String query = "SELECT * FROM studenti WHERE nome = 'Giulia';";
//		
//		try {
//			Connection conn = DriverManager.getConnection(Constants.jdbcUrl,Constants.username,Constants.password);
//			System.out.println(" connesso al database");
//			conn.close();
//		} catch(SQLException e) {
//			System.out.println("errore durante la connessione");
//			e.printStackTrace();
//		}
//		
//		
//		try {
//			Connection conn = DriverManager.getConnection(Constants.jdbcUrl,Constants.username,Constants.password);
//			System.out.println(" connesso al database");
//			Statement stat = conn.createStatement();
//			ResultSet res = stat.executeQuery(query);
//			
//			while(res.next()) {
//				Studenti studente = new Studenti();
//				studente.setId(res.getInt("id"));
//				studente.setNome(res.getString("nome"));
//				studente.setCognome(res.getString("cognome"));
//				studente.setMatricola(res.getString("matricola"));
//				studente.setData_di_nascita(res.getDate("data_di_nascita"));
//				studente.setIndirizzo(res.getString("indirizzo"));
//				studente.setId_aula(res.getInt("id_aula"));
//				studente.setDiploamto(res.getBoolean("diplomato"));
//				
//				System.out.println(studente);
//			}
//			conn.close();
//			
//		} catch(SQLException e) {
//			System.out.println("errore durante la connessione");
//			e.printStackTrace();
//		}
		
		AulaDaoImpl aula = new AulaDaoImpl();
		System.out.println(aula.get(50L));
	}

}
