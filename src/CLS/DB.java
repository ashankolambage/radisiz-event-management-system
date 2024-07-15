/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CLS;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Shehan Perera
 */
public class DB {
    static Connection c;
    public static Connection getCon() throws Exception{
    
        if(c == null){
                Class.forName("com.mysql.jdbc.Driver");
                c = DriverManager.getConnection("jdbc:mysql://localhost:3306/radisiz_final", "root", "123");
        }
        return c;
    }
    
}
