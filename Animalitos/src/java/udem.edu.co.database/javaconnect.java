/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jario
 */
public class javaconnect {
    
    public static Connection connectdb(){
        Connection con = null;
        try {
             con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "login","login" );
             return con;
        } catch (SQLException e) {
            Logger.getLogger(javaconnect.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
                     
       }
     
    
}
