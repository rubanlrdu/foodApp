package com.rose.RestaurantDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RestaurantImpl implements RestaurantInterface{
	private String URL="jdbc:mysql://localhost:3306/foodapp";
	private String USERNAME="root";
	private String PASSWORD="root";
	private String INSERT="INSERT into `restaurant` (`name`,`address`,`phone`,`rating`,`cusinetype`"
			+ ",`isActive`,`eta`,`imagepath`) values(?,?,?,?,?,?,?,?)";
	@Override
	public void addRestaurant(RestaurantTable Restaurant) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				Connection con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
				PreparedStatement pstmt=con.prepareStatement(INSERT);
				pstmt.setString(1,Restaurant.getName());
				pstmt.setString(2,Restaurant.getAddress());
				pstmt.setString(3,Restaurant.getPhone());
				pstmt.setString(4,Restaurant.getRating());
				pstmt.setString(5,Restaurant.getCusineType());
				pstmt.setString(6,Restaurant.getIsActive());
				pstmt.setString(7,Restaurant.getEta());
				pstmt.setString(8,Restaurant.getImagePath());
				pstmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	

}
