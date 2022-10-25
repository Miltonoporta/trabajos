/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 
 * @author Milton
 */

import java.sql.Date;

public class Autor {
    
   private int id_autor;
   private String cedula;
   private String nombres;
   private String apellidos;
   private String email;
   private Date fechaNac;

    public Autor() {
    }

    public Autor(int id_autor, String cedula, String nombres, String apellidos, String email, Date fechaNac) {
        this.id_autor = id_autor;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.fechaNac = fechaNac;
    }

    public int getId_autor() {
        return id_autor;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEmail() {
        return email;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setId_autor(int id_autor) {
        this.id_autor = id_autor;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }
   
 
    
           
    
    
}