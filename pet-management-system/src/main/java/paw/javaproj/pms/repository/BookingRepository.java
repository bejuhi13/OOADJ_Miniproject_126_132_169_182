package paw.javaproj.pms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import paw.javaproj.pms.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long>{

}
