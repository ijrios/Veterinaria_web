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
 * Esta clase contiene metodos para validar el campo de nombre de usuario y contraseña 
 * invocando la clase LoginDAO para obtener el nombre de usuario y la contraseña de la
 * base de datos y compararlos con los valores de front-end pasados. Si el nombre de usuario 
 * y la contraseña no coinciden, se muestra un mensaje de error. También se escribe un método 
 *  para realizar el cierre de sesión al invalidar la sesión HTTP adjunta.
 */

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import udem.edu.co.database.SessionUtils;



@ManagedBean
@SessionScoped
public class Login implements Serializable {

	private static final long serialVersionUID = 1094801825228386363L;
	
	private String pwd;
	private String msg;
	private String user;

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	/**
         * Metodo para validar el usuario 
         * @return al login o index dependiendo de la respuesta
         */
	public String validateUsernamePassword() {
		boolean valid = LoginDAO.validate(user, pwd);
		if (valid) {
			HttpSession session = SessionUtils.getSession();
			session.setAttribute("username", user);
			return "index";
		} else {
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_WARN,
							"Nombre de usuario y contraseña incorrectos",
							"Ingrese el nombre de usuario y la contraseña correcta"));
			return "login";
		}
	}
        
        /**
         * Metodo para registrar el usuario 
         * @return al login o registro dependiendo de la respuesta
         */
        public String createUsers() {
                boolean valid1 = true;
		if (valid1) {
			HttpSession session = SessionUtils.getSession();
			session.setAttribute("username", user);
			return "registro";
		} else {
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_WARN,
							"Cerrando sesión",
							"Autentiquese nuevamente"));
                        
			return "login";
		}
	}

        /**
         * Metodo para enviar contraseña
         * @return al login o emailForm dependiendo de la respuesta
         */
        public String forgotPass() {
                boolean valid1 = true;
		if (valid1) {
			HttpSession session = SessionUtils.getSession();
			session.setAttribute("username", user);
			return "emailForm.xhtml";
		} else {
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_WARN,
							"Cerrando sesión",
							"Autentiquese nuevamente"));
                        
			return "login";
		}
	}
        
	/**
         * Evento de cierre de sesión, invalidar sesión
         * @return al login de la aplicación
         */
	public String logout() {
		HttpSession session = SessionUtils.getSession();
		session.invalidate();
                System.out.println("Cerrando sesion.......");
		return "login";
	}
}