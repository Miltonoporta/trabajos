/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Milton
 */

import java.sql.*;
import java.util.*;

public class Database {
    
    private final String URL= ""+"";
    private Connection conexion;

    public Database() throws SQLException {
       
        
    
    conexion=DriverManager.getConnection(URL);
    System.out.println("Conexion Establecida");
    
    
      }catch(SQLException e){
        System.out.println("Error de conexion");
        e.printStackTrace();
        
        public int Actualizar(String consulta) {
        
            try{
                Statement st=conexion.createStatement();
                return st.executeUpdate(consulta);
            }catch (SQLException e)   {
                e.printStackTrace();
                
            } 
                return 0;
            }
            
private List OrganizarDatos(ResultSet re, int i) {
    List filas=(List) new Arraylist();
    try{
        
        int numColumnas=rs.getMetaData().getColumnCount();
        while(rs.next()) {
        Map<String, Object> renglon=new HashMap();
        for(int i=1); i<numColmnas; i++ {
        
            String nombreCampo=rs.getMetaData().getColumnas(i);
        }
        }
    }
    

        
        
  } 


}