package it.prova.testconnection.dao.aula;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.prova.testconnection.dao.Constants;
import it.prova.testconnection.model.Aula;

public class AulaDaoImpl implements AulaDao {

	Aula aula = new Aula();

	@Override
	public Aula get(Long idInput) throws Exception {
		String query = "SELECT * FROM aula WHERE id = " + idInput + ";";

		try {
			Connection conn = DriverManager.getConnection(Constants.jdbcUrl, Constants.username, Constants.password);
			System.out.println(" connesso al database");
			Statement stat = conn.createStatement();
			ResultSet res = stat.executeQuery(query);

			while (res.next()) {

				aula.setId(res.getLong("id"));
				aula.setAnno(res.getInt("anno"));
				;
				aula.setSezione(res.getString("sezione").charAt(0));
				aula.setNumeroStudenti(res.getInt("numero_studenti"));

			}
			conn.close();

		} catch (SQLException e) {
			System.out.println("errore durante la connessione");
			e.printStackTrace();
		}
		return aula;
	}

	@Override
	public int update(Aula input) throws Exception {
		String query =  " UPDATE aula SET anno= " + input.getAnno() + " , sezione = " + input.getSezione() +
				" numero_studenti = " + input.getNumeroStudenti() + "WHERE  id = " + input.getId() + ";";

		try {
			Connection conn = DriverManager.getConnection(Constants.jdbcUrl, Constants.username, Constants.password);
			System.out.println(" connesso al database");
			Statement stat = conn.createStatement();
			ResultSet res = stat.executeQuery(query);

			while (res.next()) {

				aula.setId(res.getLong("id"));
				aula.setAnno(res.getInt("anno"));
				;
				aula.setSezione(res.getString("sezione").charAt(0));
				aula.setNumeroStudenti(res.getInt("numero_studenti"));

			}
			conn.close();

		} catch (SQLException e) {
			System.out.println("errore durante la connessione");
			e.printStackTrace();
		}
		return 1;
	}

	@Override
	public int insert(Aula input) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Aula input) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
