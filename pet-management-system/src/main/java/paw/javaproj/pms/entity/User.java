package paw.javaproj.pms.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")

public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long user_id;
	
	@Column(name = "Username", nullable = false)
	private String user_name;
	
	@Column(name = "User Email", nullable=false)
	private String user_email;
	
	@Column(name = "User Password", nullable = false)
	private String user_pwd;
	
	@Column(name = "User Type", nullable = false)
	private String user_type;
	
	public User() {
		
	}
	
	public User(String user_name, String user_email, String user_pwd, String user_type) {
		super();
		this.user_name = user_name;
		this.user_email = user_email;
		this.user_pwd = user_pwd;
		this.user_type = user_type;
	}
	public Long getUserId() {
		return user_id;
	}
	public void setUserId(Long user_id) {
		this.user_id = user_id;
	}
	public String getUserName() {
		return user_name;
	}
	public void setUserName(String user_name) {
		this.user_name = user_name;
	}
	public String getUserEmail() {
		return user_email;
	}
	public void setUserEmail(String user_email) {
		this.user_email = user_email;
	}
	public String getUserPwd() {
		return user_pwd;
	}
	public void setUserPwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}
	public String getUserType() {
		return user_type;
	}
	public void setUserType(String user_type) {
		this.user_type = user_type;
	}
}