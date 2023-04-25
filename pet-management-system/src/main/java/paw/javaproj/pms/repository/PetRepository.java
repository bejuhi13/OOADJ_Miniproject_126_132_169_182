package paw.javaproj.pms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import paw.javaproj.pms.entity.Pet;

public interface PetRepository extends JpaRepository<Pet, Long>{

}
