package paw.javaproj.pms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import paw.javaproj.pms.entity.User;
import paw.javaproj.pms.repository.UserRepository;
import paw.javaproj.pms.service.UserService;

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
	public User getUserById(Long user_id) {
		return userRepository.findById(user_id).get();
	}

	@Override
	public User updateUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public void deleteUserById(Long user_id) {
		userRepository.deleteById(user_id);	
	}


}

