package net.javaguides.paw.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.paw.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

	Optional<User> findByUserName(String userName);

}
