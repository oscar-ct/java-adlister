package com.codeup.adlister.dao;

import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLUsersDao implements Users {
    private Connection connection = null;

    public MySQLUsersDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }


    @Override
    public Long insert(User user) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(createInsertQuery(), Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getPassword());
            preparedStatement.executeUpdate();
            ResultSet rs = preparedStatement.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new ad.", e);
        }
    }



    private String createInsertQuery() {
        return "INSERT INTO adlister_db.users(username, email, password) VALUES (?, ?, ?)";
    }

    private String searchUsernameQuery() {
        return "SELECT * FROM adlister_db.users WHERE username = ?";
    }

//    private String searchEmailQuery() {
//        return "SELECT * FROM adlister_db.users WHERE email = ?";
//    }

    private User extractUser(ResultSet rs) throws SQLException {
        return new User(
                rs.getLong("id"),
                rs.getString("username"),
                rs.getString("email"),
                rs.getString("password")
        );
    }


    @Override
    public User findByUsername(String username) {
//        String searchTerm = "%" + username + "%";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(searchUsernameQuery());
            preparedStatement.setString(1, username);
            ResultSet rs = preparedStatement.executeQuery();
            // this is checking to see if that records exists and if it doesn't then it returns null
            if(rs.next()) {
                return extractUser(rs);
            } else {
                return null;
            }

        } catch (SQLException sqle) {
            throw new RuntimeException("Error searching for username.", sqle);
        }

    }


//    @Override
//    public User findByUsername(String username) {
////        String searchTerm = "%" + username + "%";
//
//        try {
//            PreparedStatement preparedStatement = connection.prepareStatement(searchUsernameQuery());
//            preparedStatement.setString(1, username);
//            ResultSet rs = preparedStatement.executeQuery();
//            rs.next();
//            return extractUser(rs);
//
//        } catch (SQLException sqle) {
//            throw new RuntimeException("Error searching for username.", sqle);
//        }
//
//    }



//    @Override
//    public User findByEmail(String email) {
//        try {
//            PreparedStatement preparedStatement = connection.prepareStatement(searchEmailQuery());
//            preparedStatement.setString(1, email);
//            ResultSet rs = preparedStatement.executeQuery();
//            rs.next();
//            return extractUser(rs);
//
//        } catch (SQLException sqle) {
//            throw new RuntimeException("Error searching for email.", sqle);
//        }

//    }


}
