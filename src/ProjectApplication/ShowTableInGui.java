package ProjectApplication;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
//import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class ShowTableInGui {
    
    private final DbConnection dbConnection = new DbConnection();
    private PreparedStatement pst;
    private String TableName = "";
    
    
    public void setTableName (String s){
        TableName = s;
    }
    
    public String getTableName(){
        return TableName;
    }
    
    public void TableShow(DefaultTableModel DF){ 
        try {
            pst = dbConnection.getConnection().prepareStatement("select * from "+TableName);
            ResultSet rs = pst.executeQuery();
            ResultSetMetaData RMD = rs.getMetaData();
            int c = RMD.getColumnCount();
            String[] colNames = new String[c];
            DF.setRowCount(0);
            for(int i = 0;i<c;i++){
                colNames[i] = RMD.getColumnName(i + 1);
            }
            DF.setColumnIdentifiers(colNames);
            Object[] rows = new Object[c];
            while(rs.next()){
                for(int i = 0; i<c; i++){
                    rows[i] = rs.getString(i + 1);
                }
                DF.addRow(rows);
            }
            
            
            // This is the vector methode it will work but it not preferd by java
            
//              while(rs.next()){
//                  Vector v2 = new Vector();
//                  for(int i = 1; i<=c; i++){
//                      v2.add(rs.getString(i));
//                  }
//              DF.addRow(v2);
//              }
        } catch (SQLException ex) {
            Logger.getLogger(ShowTableInGui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


}
    


