package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FXManager implements FXInterface{
    @Override
    public void addTrader(Trading trade) {
        String INSERT_QUERY = "INSERT INTO fxtrade (Name, Investment, Investment_Returns, Status) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getInstance().connect();
             PreparedStatement pstmt = conn.prepareStatement(INSERT_QUERY)) {

            pstmt.setString(1, trade.getName());
            pstmt.setDouble(2, trade.getAmount());
            pstmt.setDouble(3, trade.interestAmount());
            pstmt.setString(4, trade.isPaid());

            int work = pstmt.executeUpdate();
            if(work==1) {
                System.out.println("Trader added successfully!");
            }else{
                System.out.println("Oops something went wrong, try again later");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void rewardTrader() {

    }

    @Override
    public void deleteTrader(int id) {
        String SQL = "DELETE FROM fxtrade WHERE id = ?";
        try (Connection conn = DatabaseConnection.getInstance().connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {

            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            System.out.println("Trader has been removed successfully!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Trading> viewPaidTraders() {
        String SQL = "SELECT * FROM fxtrade WHERE Status = Paid";
        List<Trading> trade = new ArrayList<>();
        try(Connection connect = DatabaseConnection.getInstance().connect();
            Statement stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery(SQL)) {

            while (rs.next()){
                trade.add(new Trading(
                        rs.getInt("id"),
                        rs.getString("Name"),
                        rs.getDouble("Investment")
                ));
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return trade;
    }

    @Override
    public List<Trading> viewAllTraders() {
        String SQL = "SELECT * FROM fxtrade";
        List<Trading> trade = new ArrayList<>();
        try (Connection conn = DatabaseConnection.getInstance().connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {

            while (rs.next()) {
                trade.add(new Trading(
                        rs.getInt("id"),
                        rs.getString("Name"),
                        rs.getDouble("Investment")
//                        rs.getDouble("Investment Returns"),
//                        rs.getBoolean("Status")
                ));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return trade;
    }
}
