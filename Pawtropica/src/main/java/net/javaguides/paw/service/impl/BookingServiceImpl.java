package net.javaguides.paw.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.paw.entity.Booking;
import net.javaguides.paw.repository.BookingRepository;
import net.javaguides.paw.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService{

	private BookingRepository bookingRepository;
	
	public BookingServiceImpl(BookingRepository bookingRepository) {
		super();
		this.bookingRepository = bookingRepository;
	}

	@Override
	public List<Booking> getAllBookings() {
		return bookingRepository.findAll();
	}

	@Override
	public Booking saveBooking(Booking booking) {
		return bookingRepository.save(booking);
	}

	@Override
	public Booking getBookingById(Long book_id) {
		return bookingRepository.findById(book_id).get();
	}

	@Override
	public Booking updateBooking(Booking booking) {
		return bookingRepository.save(booking);
	}

	@Override
	public void deleteBookingById(Long book_id) {
		bookingRepository.deleteById(book_id);	
	}
}


