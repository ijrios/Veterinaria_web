/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.login;

/**
 *
 * @author jario
 * @since 27/02/2022
 * @version 4
 * 
 * Esta clase genera conexión con la base de datos
 * Cargamos el controlador JDBC usando el Class.forNamemétodo
 * y usamos DriverManager.getConnectionel método pasando la url,
 * el nombre de usuario y la contraseña para conectarnos a la base de datos.
 */

import java.sql.Connection;
import java.sql.DriverManager;

public class DataConnect {

        /**
         * Este evento crea la conexipon a la base de datos
         * @return conexión generada
         */
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/my_store", "root", "f4rt5n1t4");
			return con;
		} catch (Exception ex) {
			System.out.println("Database.getConnection() Error -->"
					+ ex.getMessage());
			return null;
		}
	}

        /**
         * Este evento cierra la conexión con la base de datos
         * @param con - conexion a la base de datos
         */
	public static void close(Connection con) {
		try {
			con.close();
		} catch (Exception ex) {
		}
	}
}