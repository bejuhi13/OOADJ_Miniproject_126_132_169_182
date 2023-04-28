package net.javaguides.paw.service;

import java.util.List;

import net.javaguides.paw.entity.Booking;

public interface BookingService {
	List<Booking> getAllBookings();
	
	Booking saveBooking(Booking booking);
	
	Booking getBookingById(Long book_id);
	
	Booking updateBooking(Booking booking);
	
	void deleteBookingById(Long book_id);
}
