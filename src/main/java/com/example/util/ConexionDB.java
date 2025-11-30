package com.example.util;

import io.github.cdimascio.dotenv.Dotenv;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {

    private static final Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();

    private static final String URL = dotenv.get("DB_URL", "jdbc:mysql://localhost:3306/empresa");
    private static final String USER = dotenv.get("DB_USER", "root");
    private static final String PASSWORD = dotenv.get("DB_PASSWORD", "");

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Driver JDBC no encontrado", e);
        }
    }

    public static Connection getConexion() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
