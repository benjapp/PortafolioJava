/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Conexion.Conexion;
import Model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author STKINDUSTRIES
 */
public class ClienteController {
    private  Connection conn;
    private DefaultTableModel model;
    
    public boolean agregar(Cliente c){
        try{
        Conexion cn= new Conexion();
        conn=cn.conectarMiBD();
        
        String query= "insert into Cliente(ID_CLIENTE, PRIMER_NOMBRE, SEGUNDO_NOMBRE, APELLIDO_PATERNO, APELLIDO_MATERNO, RUT, EMAIL, PASSWORD, TELEFONO, ID_TIPO, ELIMINADO) values(SEQ_CLIENTE.NEXTVAL,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement smtp=conn.prepareStatement(query);
        smtp.setString(1,c.getPrimerNombre());
        smtp.setString(2,c.getSegundoNombre());
        smtp.setString(3,c.getApellidoPaterno());
        smtp.setString(4,c.getApellidoMaterno());
        smtp.setString(5,c.getRut());
        smtp.setString(6,c.getEmail());
        smtp.setString(7,c.getPassword());
        smtp.setInt(8,c.getTelefono());
        smtp.setInt(9,c.getIdTipo());
        smtp.setBoolean(10,c.getEliminado());
        smtp.executeUpdate();
        
        return true;
        
       }catch(SQLException ex){
             Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
             return false;
       }
    }
    public DefaultTableModel lista(){
    
      String[] titulos = {"ID", "NOMBRE", "SEGUNDO_NOMBRE", "APELLIDO_PATERNO", "APELLIDO_MATERNO", "RUT","EMAIL","PASSWORD","TELEFONO","ELIMINADO"};
        String[] registros = new String[10];
        String sql = "SELECT * FROM Cliente WHERE ELIMINADO =0";

        model = new DefaultTableModel(null, titulos);

        Conexion con = new Conexion();
        Connection cn = con.conectarMiBD();

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                registros[0] = rs.getString("ID_CLIENTE");
                registros[1] = rs.getString("PRIMER_NOMBRE");
                registros[2] = rs.getString("SEGUNDO_NOMBRE");
                registros[3] = rs.getString("APELLIDO_PATERNO");
                registros[4] = rs.getString("APELLIDO_MATERNO");
                registros[5] = rs.getString("RUT");
                registros[6] = rs.getString("EMAIL");
                registros[7] = rs.getString("PASSWORD");
                registros[8] = rs.getString("TELEFONO");
                registros[9] = rs.getString("ELIMINADO");
                model.addRow(registros);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return model;
    }   
}
