package paw.javaproj.pms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import paw.javaproj.pms.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
