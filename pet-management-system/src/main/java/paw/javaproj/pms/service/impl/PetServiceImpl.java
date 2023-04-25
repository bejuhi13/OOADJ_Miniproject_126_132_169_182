package paw.javaproj.pms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import paw.javaproj.pms.entity.Pet;
import paw.javaproj.pms.repository.PetRepository;
import paw.javaproj.pms.service.PetService;

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
	public Pet getPetById(Long pet_id) {
		return petRepository.findById(pet_id).get();
	}

	@Override
	public Pet updatePet(Pet pet) {
		return petRepository.save(pet);
	}

	@Override
	public void deletePetById(Long pet_id) {
		petRepository.deleteById(pet_id);	
	}

}

