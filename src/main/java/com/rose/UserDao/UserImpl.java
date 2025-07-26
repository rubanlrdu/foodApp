package com.rose.UserDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

public class UserImpl implements UserInterface {
	
	private String INSERT="INSERT into `users` (`name`,`username`,`password`,`email`,`phone`"
			+ ",`address`,`role`,`createdDate`,`lastLoginDate`) values(?,?,?,?,?,?,?,?,?)";
	private String getUser="select * from `users` where `username`=?";

	@Override
	public int addUser(UserTable user, Connection con) throws SQLException {
		int res=0;
				PreparedStatement pstmt=con.prepareStatement(INSERT);
				pstmt.setString(1, user.getName());
				pstmt.setString(2, user.getUserName());
				pstmt.setString(3, user.getPassword());
				pstmt.setString(4, user.getEmail());
				pstmt.setString(5, user.getPhone());
				pstmt.setString(6, user.getAddress());
				pstmt.setString(7, user.getRole());
				pstmt.setTimestamp(8, new Timestamp(System.currentTimeMillis()));
				pstmt.setTimestamp(9, new Timestamp(System.currentTimeMillis()));
				res=pstmt.executeUpdate();
		return res;
		
	}

	@Override
	public void updateUser(UserTable user, Connection con)  throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(int id, Connection con) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserTable selectUser(String username, Connection con) throws SQLException {
		PreparedStatement pstmt=con.prepareStatement(getUser);
		pstmt.setString(1, username);
		ResultSet res=pstmt.executeQuery();
		UserTable user=new UserTable();
		if(res.next()) {
			String fullname=res.getString("name");
			String password=res.getString("password");
			String uname=res.getString("username");
			String email=res.getString("email");
			String phone=res.getString("phone");
			String address=res.getString("address");
			String role=res.getString("role");
			Timestamp createdDate=res.getTimestamp("createdDate");
			String lastLoginDate=res.getString("lastLoginDate");
			user.setName(fullname);
			user.setUserName(uname);
			user.setPassword(password);
			user.setEmail(email);
			user.setPhone(phone);
			user.setAddress(address);
			user.setRole(role);
			user.setLastLoginDate(new Timestamp(System.currentTimeMillis()));
			user.setCreatedDate(createdDate);
		}
		return user;
	}

	@Override
	public List<UserTable> selectAllUsers(Connection con) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	

}
