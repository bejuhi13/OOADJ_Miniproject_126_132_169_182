package net.javaguides.paw.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.paw.entity.User;
import net.javaguides.paw.repository.UserRepository;
import net.javaguides.paw.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	private UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User getUserById(Long id) {
		return userRepository.findById(id).get();
	}

	@Override
	public User updateUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public void deleteUserById(Long id) {
		userRepository.deleteById(id);	
	}

	@Override
	public User getUserByUserName(String userName) {
		return userRepository.findByUserName(userName).get();	
	}
}

