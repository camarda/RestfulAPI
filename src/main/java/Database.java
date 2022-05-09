import java.sql.*;


public class Database {
    public static String[] getData(){
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        } catch ( ClassNotFoundException e ) {
            e.printStackTrace();
        }

        final String DB_URL = "jdbc:ucanaccess:///workspace/RestfulAPI/db.accdb;memory=false";
      
        String[] data = new String[3];
        data[0] = DB_URL;
   
        return data;
    }
}
