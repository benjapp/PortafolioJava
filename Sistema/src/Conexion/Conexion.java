/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    //String USUARIO ="admin";
    //String PASSWORD ="Duoc.2019";
    //String SID ="ORCL";
    //String HOST ="db-portafolio.cgzj6nn5uxmo.us-east-1.rds.amazonaws.com";
    //int PUERTO =1521;
    //    miCadenaDeConexion="jdbc:oracle:thin:@"+HOST+":"+PUERTO+":"+SID;
    String dbDriver = "oracle.jdbc.driver.OracleDriver";
    String dbUri = "jdbc:oracle:thin:@db-portafolio.cgzj6nn5uxmo.us-east-1.rds.amazonaws.com:1521:ORCL";
    String dbUser = "admin";
    String dbPass = "Duoc.2019";
    Connection conn = null;
    
    public Connection conectarMiBD() {
        try {
            try {
                Class.forName(dbDriver);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
            conn = DriverManager.getConnection(dbUri,dbUser, dbPass);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }

}