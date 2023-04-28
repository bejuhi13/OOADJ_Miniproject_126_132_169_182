package net.javaguides.paw.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.paw.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long>{

}
