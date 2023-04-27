package paw.javaproj.pms.service;

import java.util.List;

import paw.javaproj.pms.entity.Pet;

public interface PetService {
	List<Pet> getAllPets();
	
	Pet savePet(Pet pet);
	
	Pet getPetById(Long id);
	
	Pet updatePet(Pet pet);
	
	void deletePetById(Long id);
}
