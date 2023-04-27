package paw.javaproj.pms.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	
	@Column(name = "user_name", nullable = false)
	private String userName;
	
	@Column(name = "user_email")
	private String userEmail;
	
	@Column(name = "user_pwd")
	private String userPwd;
	
	@Column(name = "user_type")
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
		return userId;
	}
	public void setId(Long userId) {
		this.userId = userId;
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
