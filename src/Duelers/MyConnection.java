
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Duelers;
import java.sql.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.lang.Throwable;
        
/**
 *
 * @author taghr
 */
public class MyConnection
{
    Connection conn;
    public MyConnection()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver"); 
            System.out.println("Searching for Connection class....");            
        }
        catch(ClassNotFoundException cnf)
        {
            System.out.println("Class not found unable to connect "+ cnf.getLocalizedMessage());            
        }
        try
        {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/duelersstore","root","1973");
        }
        catch(SQLException e2)
        {
            e2.printStackTrace();
        }    
    }
    public Connection getConnection()
    {
        return conn;
    }
}
 
