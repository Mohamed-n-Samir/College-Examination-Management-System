package ProjectApplication;

import GUI.MainApplication;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbConnection {

    private static Connection connection;
    private String connectionUrl = "jdbc:sqlserver://PANDETA:1433;"
            + "database=Project;"
//            + "user=nash2t@PANDETA;"
//            + "password=test123@;"
//            + "encrypt=true;"
            + "trustServerCertificate=true;"
//            + "loginTimeout=30;"
            + "integratedSecurity=true;";

    public Connection getConnection() {
        return connection;
    }

    public DbConnection() {
        this("jdbc:sqlserver://PANDETA:1433;"
            + "database=Project;"
//            + "user=nash2t@PANDETA;"
//            + "password=test123@;"
//            + "encrypt=true;"
            + "trustServerCertificate=true;"
//            + "loginTimeout=30;"
            + "integratedSecurity=true;");
    }

    public DbConnection(String connectionUrl) {
        this.connectionUrl = connectionUrl;
    }

    public void setConnectionUrl(String connectionUrl) {
        this.connectionUrl = connectionUrl;
    }

    public Connection ConnectDB() {

        try {
            connection = DriverManager.getConnection(connectionUrl);
//            if (!connection.isClosed()) {
//                System.out.println("db Connected");
//            }
            return connection;

        } catch (SQLException ex) {
//            System.out.println("db Not Connected");
            Logger.getLogger(MainApplication.class.getName()).log(Level.SEVERE, null, ex);
            return null;

        }
    }

}
