package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conex {

    public Connection Conex() throws SQLException, ClassNotFoundException {
         Class.forName("org.h2.Driver");
       return (Connection) DriverManager.getConnection("jdbc:h2:~/tree", "root", "1234" );                     
    }
  
}
