package com.ukg.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Repository {

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection("");
    }

}
