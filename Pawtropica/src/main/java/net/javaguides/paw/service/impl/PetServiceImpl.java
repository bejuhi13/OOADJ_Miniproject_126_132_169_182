package net.javaguides.paw.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.paw.entity.Pet;
import net.javaguides.paw.repository.PetRepository;
import net.javaguides.paw.service.PetService;

@Service
public class PetServiceImpl implements PetService{

	private PetRepository petRepository;
	
	public PetServiceImpl(PetRepository petRepository) {
		super();
		this.petRepository = petRepository;
	}

	@Override
	public List<Pet> getAllPets() {
		return petRepository.findAll();
	}

	@Override
	public Pet savePet(Pet pet) {
		return petRepository.save(pet);
	}

	@Override
	public Pet getPetById(Long id) {
		return petRepository.findById(id).get();
	}

	@Override
	public Pet updatePet(Pet pet) {
		return petRepository.save(pet);
	}

	@Override
	public void deletePetById(Long id) {
		petRepository.deleteById(id);	
	}

}