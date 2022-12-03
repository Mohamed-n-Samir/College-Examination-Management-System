package ProjectApplication;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class GetData {
    private final DbConnection dbConnection = new DbConnection();
    private PreparedStatement pst;
    private String TableName = "";
    private String Selector = "";
    private String PK = "";
    private String url = "";
    
    GetData(String url, String Selector, String TableName, String PK){
        this.Selector = Selector;
        this.TableName = TableName;
        this.PK = PK;
        this.url = url;
    }
    
    public void setTableName (String TableName){
        this.TableName = TableName;
    }
    
    public String getTableName(){
        return TableName;
    }
    
    public void setSelector (String Selector){
        this.Selector = Selector;
    }
    
    public String getSelector(){
        return Selector;
    }
    
    public void setPK (String PK){
        this.PK = PK;
    }
    
    public String getPK(){
        return PK;
    }
    
    public void getDataFromDBPK(){
        try {
            dbConnection.setConnectionUrl(url);
            dbConnection.ConnectDB();
            System.out.println("connect");
            pst = dbConnection.getConnection().prepareStatement("select * from "+TableName);
            ResultSet rs = pst.executeQuery();
            ResultSetMetaData RMD = rs.getMetaData();
            
            while(rs.next()){
                System.out.println(rs.getString(1) + rs.getString(2));
            }

                
        } catch (SQLException ex) {
            Logger.getLogger(ShowTableInTermenal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
