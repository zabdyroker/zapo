/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diseño;

/**
 *
 * @author zabdy
 */
import java.sql.*;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;


public class conecta {

 Connection conectar= null;
 
 public Connection conexion (){
 
 try{
 Class.forName("com.mysql.jdbc.Driver");
 conectar = DriverManager.getConnection("jdbc:mysql://localhost/ventas?user=root&password=zabdiR123");
 
 
 
 }catch(Exception e){
 
  System.out.printf(e.getMessage());
  //JOptionPane.showMessageDialog(null,e,"ERROR DE CONEXION", ERROR_MESSAGE);
  System.out.println(e);
  System.out.println("conectado");
 
 }
 return conectar;
 }

    Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    
}
