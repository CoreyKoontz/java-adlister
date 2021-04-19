package com.codeup.adlister.dao;

import com.codeup.adlister.models.Ad;
import com.mysql.cj.jdbc.Driver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private Connection connection = null;

    public MySQLAdsDao() {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    Config.getUrl(),
                    Config.getUsername(),
                    Config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }

    // TODO-------------------------------------------------- Refactor to use prepared statements:
    @Override
    public List<Ad> all() {
        PreparedStatement ps = null;
        try {
            String sql = "SELECT * FROM ads";
            ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            return createAdsFromResults(rs);
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving all ads.", e);
        }
    }


    @Override
    public Long insert(Ad ad) {


        try {
            String sql = "INSERT INTO ads(user_id, title, description) VALUES (?, ?, ?)";
            PreparedStatement ps = null;
            ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setLong(1, ad.getUserId());
            ps.setString(2, ad.getTitle());
            ps.setString(3, ad.getDescription());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);


        } catch (SQLException e) {
            throw new RuntimeException("Error creating ad!", e);

        }
    }
    // TODO-------------------------------------------------- Refactor to use prepared statements:
//    private String createInsertQuery(Ad ad) {
//
//        String sql = "INSERT INTO ads(user_id, title, description) VALUES (?, ?, ?)";
//        PreparedStatement ps = null;
//
//        try {
//            ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//            ps.setLong(1, ad.getUserId());
//            ps.setString(2, ad.getTitle());
//            ps.setString(3, ad.getDescription());
//            ps.executeUpdate();
//            ResultSet rs = ps.getGeneratedKeys();
//            rs.next();
//            return rs.getLong(1);
//
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//    }


    private Ad extractAd(ResultSet rs) throws SQLException {
        return new Ad(
                rs.getLong("id"),
                rs.getLong("user_id"),
                rs.getString("title"),
                rs.getString("description")
        );
    }

    private List<Ad> createAdsFromResults(ResultSet rs) throws SQLException {
        List<Ad> ads = new ArrayList<>();
        while (rs.next()) {
            ads.add(extractAd(rs));
        }
        return ads;
    }
}
