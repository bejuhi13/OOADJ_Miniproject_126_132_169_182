package net.javaguides.paw.service;

import java.util.List;

import net.javaguides.paw.entity.Pet;

public interface PetService {
	List<Pet> getAllPets();
	
	Pet savePet(Pet pet);
	
	Pet getPetById(Long id);
	
	Pet updatePet(Pet pet);
	
	void deletePetById(Long id);
}
