package paw.javaproj.pms.service;

import java.util.List;

import paw.javaproj.pms.entity.User;

public interface UserService {
	List<User> getAllUsers();
	
	User saveUser(User user);
	
	User getUserById(Long user_id);
	
	User updateUser(User user);
	
	void deleteUserById(Long user_id);
}
