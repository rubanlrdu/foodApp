package com.rose.UserDao;
import java.sql.Timestamp;

public class UserTable {
private int userId;
private String name;
private String userName;
private String password;
private String email;
private String phone;
private String Address;
/*private enum role {
	admin,
	customer
};*/
private String role;
Timestamp createdDate;
Timestamp lastLoginDate;
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getRole() {
	return role;
}
public void setRole(String role1) {
	this.role = role1;
}
public Timestamp getCreatedDate() {
	return createdDate;
}
public void setCreatedDate(Timestamp createdDate) {
	this.createdDate = createdDate;
}
public Timestamp getLastLoginDate() {
	return lastLoginDate;
}
public void setLastLoginDate(Timestamp lastLoginDate) {
	this.lastLoginDate = lastLoginDate;
}
@Override
public String toString() {
	return "UserTable [userId=" + userId + ", name=" + name + ", userName=" + userName + ", password=" + password
			+ ", email=" + email + ", phone=" + phone + ", Address=" + Address + ", role=" + role + ", createdDate="
			+ createdDate + ", lastLoginDate=" + lastLoginDate + "]";
}

}
