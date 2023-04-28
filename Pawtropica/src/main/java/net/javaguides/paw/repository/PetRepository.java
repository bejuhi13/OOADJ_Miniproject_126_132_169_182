package net.javaguides.paw.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.paw.entity.Pet;

public interface PetRepository extends JpaRepository<Pet, Long>{

}
