package dao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.util.Properties;

public interface ConnectToDatabase {
    public static Connection getConnection(){
        try {
            Properties prop = new Properties();
            prop.load(Files.newInputStream(Paths.get("config.properties")));
            final String URL = prop.getProperty("url");
            final String USER = prop.getProperty("username");
            final String PASS = prop.getProperty("password");
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(URL, USER, PASS);
            return connection;
        } catch (SQLException | ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
