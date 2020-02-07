package com.company;

import com.mysql.cj.x.protobuf.MysqlxPrepare;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StaffApplication {
    Connection con;

    public void insert(Staff staff) {
         con = ConnectDatabase.getConnection();
        try {
            String query = "insert into staff(staffId, name, wage, position) values(?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, staff.getId());
            pst.setString(2, staff.getName());
            pst.setBigDecimal(3, staff.getWage());
            pst.setString(4, staff.getPosition());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void findAll() {
        con = ConnectDatabase.getConnection();
        String query = "select * from staff";
        try {
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                System.out.println("Id: " + rs.getInt("staffId"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Wage: " + rs.getBigDecimal("wage"));
                System.out.println("Position: " + rs.getString("position"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int id){
        con = ConnectDatabase.getConnection();
        try {
            String query = "delete from staff where staffId = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, id);
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateName(int id, String name) {
        con = ConnectDatabase.getConnection();
        try {
            String query = "update staff set name = ? where staffId = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, name);
            pst.setInt(2, id);
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateWage(int id, BigDecimal wage) {
        con = ConnectDatabase.getConnection();
        try {
            String query = "update staff set wage = ? where staffId = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setBigDecimal(1, wage);
            pst.setInt(2, id);
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updatePosition(int id, String position) {
        con = ConnectDatabase.getConnection();
        try {
            String query = "update staff set position = ? where staffId = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, position);
            pst.setInt(2, id);
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void getById(int id) {
        con = ConnectDatabase.getConnection();
        try {
            String query = "select * from staff where staffId = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                System.out.println("Id: " + rs.getInt("staffId"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Wage: " + rs.getBigDecimal("wage"));
                System.out.println("Position: " + rs.getString("position"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Integer returnTheLastestId(){
        con = ConnectDatabase.getConnection();
        int id = 0;
        try {
            String query = "select * from staff where (select max(staffId) from staff)";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                id = rs.getInt("staffId");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return id;
    }

    public void exit() throws SQLException {
        con = ConnectDatabase.getConnection();
        con.close();
    }
}
