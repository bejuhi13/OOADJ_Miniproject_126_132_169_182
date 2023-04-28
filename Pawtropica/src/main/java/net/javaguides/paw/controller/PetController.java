package net.javaguides.paw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.javaguides.paw.entity.Pet;
import net.javaguides.paw.service.PetService;

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
	private String PetType;
	
	@PostMapping("/pets")
	public String savePet(@ModelAttribute("pet") Pet pet) {
		PetType = pet.petType;
		petService.savePet(pet);
		return "result";
	}
	
	@GetMapping("/pets/edit/{id}")
	public String editPetForm(@PathVariable Long id, Model model) {
		model.addAttribute("pet", petService.getPetById(id));
		return "edit_pet";
	}

	@PostMapping("/pets/{id}")
	public String updatePet(@PathVariable Long id,
			@ModelAttribute("pet") Pet pet,
			Model model) {
		
		// get pet from database by id
		Pet existingPet = petService.getPetById(id);
		existingPet.setId(id);
		existingPet.setPetName(pet.getPetName());
		existingPet.setPetType(pet.getPetType());
		existingPet.setPetOwner(pet.getPetOwner());
		existingPet.setMedHistory(pet.getMedHistory());
		
		// save updated pet object
		petService.updatePet(existingPet);
		return "redirect:/pets";		
	}
	
	// handler method to handle delete pet request
	
	@GetMapping("/pets/{id}")
	public String deleteStudent(@PathVariable Long id) {
		petService.deletePetById(id);
		return "redirect:/pets";
	}
	
	
	
}