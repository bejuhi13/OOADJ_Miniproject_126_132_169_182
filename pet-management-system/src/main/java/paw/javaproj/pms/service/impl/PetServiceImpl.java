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
	public Pet getPetById(Long petId) {
		return petRepository.findById(petId).get();
	}

	@Override
	public Pet updatePet(Pet pet) {
		return petRepository.save(pet);
	}

	@Override
	public void deletePetById(Long petId) {
		petRepository.deleteById(petId);	
	}

}