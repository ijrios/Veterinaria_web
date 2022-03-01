/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.dto;

import java.io.Serializable;

/**
 *
 * @author jario
 * @since 27/02/2022
 * @version 4
 * 
 * Esta es una copia de la clase entidad, sin la conexión a la base de datos
 *  
 */
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer uid;
    
    private String uname;
    
    private String password;

    public Users() {
    }

    public Users(Integer uid) {
        this.uid = uid;
    }

    public Users(Integer uid, String uname, String password) {
        this.uid = uid;
        this.uname = uname;
        this.password = password;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   
}
