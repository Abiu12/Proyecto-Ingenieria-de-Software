package conexion;
import java.sql.*;

public class Conexion {
    private static Connection con;
    public static final String driver="com.mysql.jdbc.Driver";
    public static final String user="root";
    
    public static final String pass="12345";
    public static final String url="jdbc:mysql://localhost/bd_taller?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    
    public static Connection obtenerConexion() {
        try {
            Connection con = (Connection)DriverManager.getConnection(url,user,pass);
            if(con!=null){
                return con;
            }
        } catch ( SQLException ex) {
            System.out.println(ex.toString());
            return null;
        }
           return con;
    }
    public static void main(String[] args) {
        Conexion con=new Conexion();
        con.obtenerConexion();
    }
}
