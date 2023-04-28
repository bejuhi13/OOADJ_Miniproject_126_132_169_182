package net.javaguides.paw.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id=-1l;
	
	@Column(name = "username", nullable = false)
	private String userName;
	
	@Column(name = "useremail")
	private String userEmail;
	
	@Column(name = "userpwd")
	private String userPwd;
	
	@Column(name = "usertype")
	private String userType;
	
	public User() {
		
	}
	
	
	public User(String userName, String userEmail, String userPwd, String userType) {
		super();
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPwd = userPwd;
		this.userType = userType;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
}
