package com.codeup.adlister.dao;

import com.codeup.adlister.dao.Users;
import com.codeup.adlister.models.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySQLUsersDao implements Users {

    @Override
    public User findByUsername(String username) {
        String sql = "SELECT * FROM users WHERE username LIKE ?";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();
            rs.next();
            return extractUser(rs);
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving user.", e);
        }
    }

}
