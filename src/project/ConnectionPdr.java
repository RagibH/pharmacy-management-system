package project;

import java.sql.*;
import java.io.FileInputStream;
import java.util.Properties;

public class ConnectionPdr {
    public static Connection getCon() {
        Connection conn = null;
        try {
            // Load properties file
            Properties props = new Properties();
            FileInputStream fis = new FileInputStream("config.properties");
            props.load(fis);

            String host = props.getProperty("db.host", "localhost");
            String port = props.getProperty("db.port", "3306");
            String db   = props.getProperty("db.name", "pharma");
            String user = props.getProperty("db.user", "root");
            String pass = props.getProperty("db.pass", "");

            String url = "jdbc:mysql://" + host + ":" + port + "/" + db + "?useSSL=false&serverTimezone=UTC";

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pass);

            System.out.println("✅ Database connected successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
