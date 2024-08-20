package com.user;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconn {
    public static String filepath;

	public static Connection conn() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/agri_food_supply_chain", 
                "root", 
                "system"
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
