package paw.javaproj.pms.service;

import java.util.List;

import paw.javaproj.pms.entity.Booking;

public interface BookingService {
	List<Booking> getAllBookings();
	
	Booking saveBooking(Booking booking);
	
	Booking getBookingById(Long book_id);
	
	Booking updateBooking(Booking booking);
	
	void deleteBookingById(Long book_id);
}
