package net.javaguides.paw.service;

import java.util.List;

import net.javaguides.paw.entity.User;

public interface UserService {
	List<User> getAllUsers();
	
	User saveUser(User user);
	
	User getUserById(Long id);
	
	User updateUser(User user);
	
	User getUserByUserName(String userName);
	
	void deleteUserById(Long id);
}
