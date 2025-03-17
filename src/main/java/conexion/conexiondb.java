package conexion;

import java.sql.*;

public class conexiondb {
         
    private static conexiondb instance;
    private Connection conection;
    
    private final String URL = "jdbc:postgresql://192.168.10.188:5432/anteiku";
    private final String USER = "postgres";
    private final String PASS = "Dani0418!0";
    
    private void conectar() {
        try {
            Class.forName("org.postgresql.Driver");
            conection = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (ClassNotFoundException e) {
            System.err.println("Error: Driver de PostgreSQL no encontrado.");
        } catch (SQLException e) {
            System.err.println("Error de conexión: " + e.getMessage());
        }
    }
    
     public static conexiondb getInstance() {
        if (instance == null) {
            instance = new conexiondb();
        }
        return instance;
    }
     
    public Connection getConexion() {
        try {
            if (conection == null || conection.isClosed()) {
                System.out.println("Reconectando a la base de datos...");
                conectar();
            }
        } catch (SQLException e) {
            System.err.println("Error al verificar la conexión: " + e.getMessage());
        }
        return conection;
    }
    
    public void cerrarConexion() {
        try {
            if (conection != null && !conection.isClosed()) {
                conection.close();
                System.out.println("Conexión cerrada correctamente.");
            }
        } catch (SQLException e) {
            System.err.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
    
}
