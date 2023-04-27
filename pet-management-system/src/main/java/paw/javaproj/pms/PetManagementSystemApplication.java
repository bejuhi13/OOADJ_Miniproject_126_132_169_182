package paw.javaproj.pms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import paw.javaproj.pms.entity.Pet;
import paw.javaproj.pms.repository.PetRepository;

@SpringBootApplication
public class PetManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PetManagementSystemApplication.class, args);
	}

	@Autowired
	private PetRepository petRepository;

	@Override
	public void run(String... args) throws Exception {
//		Pet pet1 = new Pet("Mickey", "Shih Tzu", "Jay","Blind");
//		petRepository.save(pet1);
		
	}
}
