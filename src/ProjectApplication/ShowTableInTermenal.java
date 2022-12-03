package ProjectApplication;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
//import java.sql.ResultSetMetaData;

public class ShowTableInTermenal {
    
    private final DbConnection dbConnection = new DbConnection();
    private PreparedStatement pst;
    
    public void TableShow(){
        try {
            dbConnection.ConnectDB();
            pst = dbConnection.getConnection().prepareStatement("select * from employee");
            ResultSet rs = pst.executeQuery();
//            ResultSetMetaData RMD = rs.getMetaData();
            while(rs.next()){
                System.out.println(rs.getString(1) +" "+ rs.getString(2) +" "+ rs.getString(3));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ShowTableInTermenal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
