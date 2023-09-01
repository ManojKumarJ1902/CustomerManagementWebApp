package com.example.webApp2.model;

import java.sql.Date;

import javax.persistence.*;


@Entity
@Table (name = "Users")
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userID;
	private String username;
	private String useraddress;
	private String userphone;
	private String usermail;
	private Date dateupdated;
	@Lob	//annotation used to convert to image to byte code
	private byte[] userimage;
	@Transient	//annotation used to copying the image as string value
	private String userimage2;
	
	public String getUserimage2() {
		return userimage2;
	}
	public void setUserimage2(String userimage2) {
		this.userimage2 = userimage2;
	}
	public byte[] getUserimage() {
		return userimage;
	}
	public void setUserimage(byte[] userimage) {
		this.userimage = userimage;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUseraddress() {
		return useraddress;
	}
	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}
	public String getUserphone() {
		return userphone;
	}
	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}
	public String getUsermail() {
		return usermail;
	}
	public void setUsermail(String usermail) {
		this.usermail = usermail;
	}
	public Date getDateupdated() {
		return dateupdated;
	}
	public void setDateupdated(Date dateupdated) {
		this.dateupdated = dateupdated;
	}
}
