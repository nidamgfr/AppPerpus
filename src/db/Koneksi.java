package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    
           
       
        private final String url ="jdbc:mysql://localhost/db_perpus1" ;
        private final String user ="root";
        private final String pass ="";
        
        public Connection getConnection() {
            Connection con;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url , user , pass);
                System.out.println("Koneksi Berhasil");
                return con; 
            }
            catch (ClassNotFoundException | SQLException ex) {
                System.err.println("Koneksi Gagal");
                return con=null;
            }
        }
        
        public static void main (String[] args ) {
            Koneksi koneksi = new Koneksi();
            koneksi.getConnection();
        }
}
        
        
   