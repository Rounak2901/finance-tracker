package com.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.user.model.User;

public class UserDAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/userappdb"; // Database URL
    private String jdbcUsername = "root"; // Database username
    private String jdbcPassword = "root"; // Database password

    // SQL query to insert transaction details
    private static final String INSERT_TRANSACTION_SQL = "INSERT INTO transactions (description, amount, type) VALUES (?, ?, ?);";

    public UserDAO() {}

    // Establish DB connection
    private Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    // Method to insert a transaction
    public boolean insertTransaction(User transaction) {
        boolean rowInserted = false;
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_TRANSACTION_SQL)) {
            preparedStatement.setString(1, transaction.getDescription());
            preparedStatement.setDouble(2, transaction.getAmount());
            preparedStatement.setString(3, transaction.getType());
            rowInserted = preparedStatement.executeUpdate() > 0; // Executes the insert query
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowInserted;
    }
}
