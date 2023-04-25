package paw.javaproj.pms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import paw.javaproj.pms.entity.Pet;
import paw.javaproj.pms.service.PetService;

import paw.javaproj.pms.entity.User;
import paw.javaproj.pms.service.UserService;

@Controller
public class PetController {
	
	private PetService petService;

	public PetController(PetService petService) {
		super();
		this.petService = petService;
	}
	
	// handler method to handle list pets and return mode and view
	@GetMapping("/pets")
	public String listPets(Model model) {
		model.addAttribute("pets", petService.getAllPets());
		return "pets";
	}
	
	@GetMapping("/pets/new")
	public String createPetForm(Model model) {
		
		// create pet object to hold pet form data
		Pet pet = new Pet();
		model.addAttribute("pet", pet);
		return "create_pet";
		
	}
	
	@PostMapping("/pets")
	public String savePet(@ModelAttribute("pet") Pet pet) {
		petService.savePet(pet);
		return "redirect:/pets";
	}
	
	@GetMapping("/pets/edit/{pet_id}")
	public String editPetForm(@PathVariable Long pet_id, Model model) {
		model.addAttribute("pet", petService.getPetById(pet_id));
		return "edit_pet";
	}

	@PostMapping("/pets/{pet_id}")
	public String updatePet(@PathVariable Long pet_id,
			@ModelAttribute("pet") Pet pet,
			Model model) {
		
		// get pet from database by id
		Pet existingPet = petService.getPetById(pet_id);
		existingPet.setPetId(pet_id);
		existingPet.setPetName(pet.getPetName());
		existingPet.setPetBreed(pet.getPetBreed());
		existingPet.setPetOwner(pet.getPetOwner());
		existingPet.setMedHistory(pet.getMedHistory());
		
		
		// save updated pet object
		petService.updatePet(existingPet);
		return "redirect:/pets";		
	}
	
	// handler method to handle delete pet request
	
	@GetMapping("/pets/{pet_id}")
	public String deletePet(@PathVariable Long pet_id) {
		petService.deletePetById(pet_id);
		return "redirect:/pets";
	}
	private UserService userService;

	public PetController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	// handler method to handle list pets and return mode and view
	@GetMapping("/users")
	public String listUsers(Model model) {
		model.addAttribute("users", userService.getAllUsers());
		return "users";
	}
	
	@GetMapping("/users/new")
	public String createUserForm(Model model) {
		
		// create pet object to hold pet form data
		User user = new User();
		model.addAttribute("user", user);
		return "create_user";
		
	}
	
	@PostMapping("/users")
	public String saveUser(@ModelAttribute("user") User user) {
		userService.saveUser(user);
		return "redirect:/users";
	}
	
	@GetMapping("/users/edit/{user_id}")
	public String editUserForm(@PathVariable Long user_id, Model model) {
		model.addAttribute("user", userService.getUserById(user_id));
		return "edit_user";
	}

	@PostMapping("/pets/{pet_id}")
	public String updateUser(@PathVariable Long user_id,
			@ModelAttribute("user") User user,
			Model model) {
		
		// get pet from database by id
		User existingUser = userService.getUserById(user_id);
		existingUser.setUserId(user_id);
		existingUser.setUserName(user.getUserName());
		existingUser.setUserEmail(user.getUserEmail());
		existingUser.setUserPwd(user.getUserPwd());
		existingUser.setUserType(user.getUserType());
		
		
		// save updated pet object
		userService.updateUser(existingUser);
		return "redirect:/users";		
	}
	
	// handler method to handle delete pet request
	
	@GetMapping("/users/{user_id}")
	public String deleteUser(@PathVariable Long user_id) {
		userService.deleteUserById(user_id);
		return "redirect:/users";
	}
	
}
