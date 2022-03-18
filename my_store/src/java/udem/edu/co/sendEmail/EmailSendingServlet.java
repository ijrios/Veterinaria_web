package udem.edu.co.sendEmail;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
 
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
/**
 *
 * @author jario
 * @since 17/03/2022
 * @version 5
 * 
 * Esta clase envia los correos electronicos, trae información de la pagina emailForm.xhtml - action="EmailSendingServlet" method="post"
 * Bibliografía:  www.codejava.net
 */

@WebServlet("/EmailSendingServlet")
public class EmailSendingServlet extends HttpServlet {
    private String host;
    private String port;
    private String user;
    private String pass;
 
    public void init() {
        // reads SMTP server setting from web.xml file
        ServletContext context = getServletContext();
        host = context.getInitParameter("host");
        port = context.getInitParameter("port");
        user = context.getInitParameter("user");
        pass = context.getInitParameter("pass");
    }

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_store", "root", "f4rt5n1t4");
            Statement st = con.createStatement();
            String email = request.getParameter("recipient");
            String strQuery = "SELECT password FROM users where uname='" + email + "'";
            ResultSet rs = st.executeQuery(strQuery);
            rs.next();
            String Countrow = rs.getString(1);

            if (Countrow.equals("1")) {

                System.out.println("Correo invalido !");

            } else {

                // reads form fields
                String recipient = request.getParameter("recipient");
                String subject = "Contraseña de acceso a la cuenta";
                String content = "Usted ha pedido obtener su contraseña de acceso a la cuenta del sistema de gestión de base de datos. La contraseña es: " +Countrow ;

                String resultMessage = "";

                try {
                    EmailUtility.sendEmail(host, port, user, pass, recipient, subject,
                            content);
                    resultMessage = "El correo fue enviado con éxito!";
                } catch (Exception ex) {
                    ex.printStackTrace();
                    resultMessage = "Error: " + ex.getMessage();
                } finally {
                    request.setAttribute("Message", resultMessage);
                    getServletContext().getRequestDispatcher("/result.jsp").forward(
                            request, response);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}