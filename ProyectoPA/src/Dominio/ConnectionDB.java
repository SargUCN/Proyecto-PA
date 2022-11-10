package Dominio;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

    private static Connection connection;
    private static final String host = "localhost";
    private static final String port = "5432";
    private static final String db_name = "ProyectoPA";
    private static final String username = "postgres";
    private static final String pass = "1234";

    public ConnectionDB() throws ClassNotFoundException, SQLException, IOException {
        connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://"+host+":"+port+"/"+db_name+"", ""+username+"", ""+pass+"");
            if (connection != null) {
                System.out.println("Connection OK");
            } else {
                System.out.println("Connection Failed");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.exit(0);
        }

    }

    public Connection getConnection() {
        return connection;
    }

    public void close() {
        connection = null;
        if (connection == null) {
            System.out.println("Conexión terminada");
        }
    }
    
    

}
