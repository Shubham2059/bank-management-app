package banking.management.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    public Conn(){
        try{            
//            Class.forName(com.mysql.cj.jdbc.Driver); //Register the driver
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "$#1809sqlMY"); //Create Connection String
            s = c.createStatement();    //Create Statement
        } catch (Exception e){
            System.out.println(e);
        }
    }

   
 
}
