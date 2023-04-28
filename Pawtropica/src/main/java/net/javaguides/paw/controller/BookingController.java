package net.javaguides.paw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.javaguides.paw.entity.Booking;
import net.javaguides.paw.service.BookingService;

@Controller
public class BookingController {
	
	private BookingService bookingService;

	public BookingController(BookingService bookingService) {
		super();
		this.bookingService = bookingService;
	}
	
	// handler method to handle list bookings and return mode and view
	@GetMapping("/bookings")
	public String listBookings(Model model) {
		model.addAttribute("bookings", bookingService.getAllBookings());
		return "bookings";
	}
	
	@GetMapping("/bookings/new")
	public String createBookingForm(Model model) {
		
		// create booking object to hold booking form data
		Booking booking = new Booking();
		model.addAttribute("booking", booking);
		return "create_booking";
		
	}
	
	@PostMapping("/bookings")
	public String saveBooking(@ModelAttribute("booking") Booking booking) {
		bookingService.saveBooking(booking);
		return "redirect:/bookings";
	}
	
	@GetMapping("/bookings/edit/{id}")
	public String editBookingForm(@PathVariable Long id, Model model) {
		model.addAttribute("booking", bookingService.getBookingById(id));
		return "edit_booking";
	}

	@PostMapping("/bookings/{id}")
	public String updateBooking(@PathVariable Long id,
			@ModelAttribute("booking") Booking booking,
			Model model) {
		
		// get booking from database by id
		Booking existingBooking = bookingService.getBookingById(id);
		existingBooking.setId(id);
		existingBooking.setPetId(booking.getPetId());
		existingBooking.setPetName(booking.getPetName());
		existingBooking.setOwnerId(booking.getOwnerId());
		existingBooking.setBookingDate(booking.getBookingDate());
		existingBooking.setVolunteerName(booking.getPetName());
		
		// save updated booking object
		bookingService.updateBooking(existingBooking);
		return "redirect:/bookings";		
	}
	
	// handler method to handle delete booking request
	
	@GetMapping("/bookings/{id}")
	public String deleteStudent(@PathVariable Long id) {
		bookingService.deleteBookingById(id);
		return "redirect:/bookings";
	}
	
}