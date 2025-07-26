package com.rose.RestaurantDao;

public class RestaurantTable {
	
	private int restaurantID;
	private String name;
	private String address;
	private String phone;
	private String rating;
	private String cusineType;
	private String isActive;
	private String eta;
	private int adminUserId;
	private String imagePath;
	public int getRestaurantID() {
		return restaurantID;
	}
	public void setRestaurantID(int restaurantID) {
		this.restaurantID = restaurantID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getCusineType() {
		return cusineType;
	}
	public void setCusineType(String cusineType) {
		this.cusineType = cusineType;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	public String getEta() {
		return eta;
	}
	public void setEta(String eta) {
		this.eta = eta;
	}
	public int getAdminUserId() {
		return adminUserId;
	}
	public void setAdminUserId(int adminUserId) {
		this.adminUserId = adminUserId;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	@Override
	public String toString() {
		return "RestaurantTable [restaurantID=" + restaurantID + ", name=" + name + ", address=" + address + ", phone="
				+ phone + ", rating=" + rating + ", cusineType=" + cusineType + ", isActive=" + isActive + ", eta="
				+ eta + ", adminUserId=" + adminUserId + ", imagePath=" + imagePath + "]";
	}
	

}
