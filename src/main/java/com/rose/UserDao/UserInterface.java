package com.rose.UserDao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface UserInterface {
	int addUser(UserTable user, Connection con) throws SQLException;
	void updateUser(UserTable user,Connection con) throws SQLException;
	void deleteUser(int id,Connection con) throws SQLException;
	UserTable selectUser(String username,Connection con) throws SQLException;
	List<UserTable>selectAllUsers(Connection con) throws SQLException;
}
