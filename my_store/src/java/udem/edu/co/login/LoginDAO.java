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
 * En esta clase establecemos la conexión con la base de datos invocando el método de la clase DataConnect,
 * y se construye la consulta para obtener los datos de la base de datos con los valores ingresados ​​​​por el usuario. 
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LoginDAO {

        /**
         * Este metodo crea la consulta con la base datos para extraer datos y validar login
         * @param user
         * @param password
         * @return estado del login
         */
	public static boolean validate(String user, String password) {
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = DataConnect.getConnection();
			ps = con.prepareStatement("Select uname, password from users where uname = ? and password = ?");
			ps.setString(1, user);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				//result found, means valid inputs
				return true;
			}
		} catch (SQLException ex) {
			System.out.println("Login error -->" + ex.getMessage());
			return false;
		} finally {
			DataConnect.close(con);
		}
		return false;
	}
}