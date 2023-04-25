package paw.javaproj.pms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import paw.javaproj.pms.entity.Pet;
import paw.javaproj.pms.repository.PetRepository;
import paw.javaproj.pms.entity.User;
import paw.javaproj.pms.repository.UserRepository;

@SpringBootApplication
public class PetManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PetManagementSystemApplication.class, args);
	}
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		 User user1 = new User("Admin1", "admin@123", "admin123","ADMIN");
		 userRepository.save(user1);
		 User user2 = new User("Admin2", "admin@123", "admin123","ADMIN");
		 userRepository.save(user2);
		 User user3 = new User("Admin3", "admin@123", "admin123","ADMIN");
		 userRepository.save(user3);		
	}

}
