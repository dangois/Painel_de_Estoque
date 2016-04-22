package br.com.fabricadeprogramador.persistencia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

	public static Connection getConnection() {

		try {
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/fabricaweb", "postgres", "projetoufs");
		} catch (SQLException e) {
			// Relancando a exeception
			throw new RuntimeException(e);
		}
	}

}
