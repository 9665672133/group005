package com.admin;

public class Order {
	String Quantity;
	String Book_Id,Cust_Name,Phone_No,Address;
	
	
	public String getQuantity() {
		return Quantity;
	}
	public void setQuantity(String qaun) {
		Quantity = qaun;
	}
	public String getBook_Id() {
		return Book_Id;
	}
	public void setBook_Id(String book_Id) {
		Book_Id = book_Id;
	}
	public String getCust_Name() {
		return Cust_Name;
	}
	public void setCust_Name(String cust_Name) {
		Cust_Name = cust_Name;
	}
	public String getPhone_No() {
		return Phone_No;
	}
	public void setPhone_No(String phone_No) {
		Phone_No = phone_No;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}

}
