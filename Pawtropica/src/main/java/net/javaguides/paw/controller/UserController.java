package net.javaguides.paw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.javaguides.paw.entity.User;
import net.javaguides.paw.service.UserService;

@Controller
public class UserController {
	
	private UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	@GetMapping("/")
	public String toLogin(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "login";
	}
	@GetMapping("/{userName}")
	public String userAuthenticate(Model model, @PathVariable String userName) {
		// create user object to hold user form data
		model.addAttribute("user", userService.getUserByUserName(userName));
		
		return "create_user";
		
	}
	// handler method to handle list users and return mode and view
	@GetMapping("/users")
	public String listUsers(Model model) {
		model.addAttribute("users", userService.getAllUsers());
		return "users";
	}
	
	@GetMapping("/users/new")
	public String createUserForm(Model model) {
		
		// create user object to hold user form data
		User user = new User();
		model.addAttribute("user", user);
		return "create_user";
		
	}
	
	@PostMapping("/users")
	public String saveUser(@ModelAttribute("user") User user) {
		userService.saveUser(user);
		return "redirect:/users";
	}
	
	@GetMapping("/users/edit/{id}")
	public String editUserForm(@PathVariable Long id, Model model) {
		model.addAttribute("user", userService.getUserById(id));
		return "edit_user";
	}

	@PostMapping("/users/{id}")
	public String updateUser(@PathVariable Long id,
			@ModelAttribute("user") User user,
			Model model) {
		
		// get user from database by id
		User existingUser = userService.getUserById(id);
		existingUser.setId(id);
		existingUser.setUserName(user.getUserName());
		existingUser.setUserEmail(user.getUserEmail());
		existingUser.setUserPwd(user.getUserPwd());
		existingUser.setUserType(user.getUserType());		
		
		// save updated user object
		userService.updateUser(existingUser);
		return "redirect:/users";		
	}
	
	// handler method to handle delete user request
	
	@GetMapping("/users/{id}")
	public String deleteStudent(@PathVariable Long id) {
		userService.deleteUserById(id);
		return "redirect:/users";
	}
	
}
