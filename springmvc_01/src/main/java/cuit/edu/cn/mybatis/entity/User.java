package cuit.edu.cn.mybatis.entity;

public class User {

 private int id;
 private String name;
 private String pass;
private String phone;
 private String address;
 public User(){
	 
 }
 public User(String name, String pass, String address, String phone) {
		 super();
		 this.name = name;
		 this.pass = pass;
		 this.address = address;}
 @Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
 
 
}
