package net.javaguides.paw.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "bookings")
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "petid", nullable = false)
	private Long petId;
	
	@Column(name = "petname")
	private String petName;
	
	@Column(name = "ownerid")
	private Long ownerId;
	
	@Column(name = "bookingdate")
	private String bookingDate;
	
	@Column(name = "volunteername")
	private String volunteerName;
	
	public Booking() {
		
	}
	
	public Booking(Long petId, String petName, Long ownerId, String bookingDate, String volunteerName) {
		super();
		this.petId = petId;
		this.petName = petName;
		this.ownerId = ownerId;
		this.bookingDate = bookingDate;
		this.volunteerName=volunteerName;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long bookingId) {
		this.id = bookingId;
	}
	public Long getPetId() {
		return petId;
	}
	public void setPetId(Long petId) {
		this.petId = petId;
	}
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public Long getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	public String getVolunteerName() {
		return volunteerName;
	}
	public void setVolunteerName(String volunteerName) {
		this.volunteerName = volunteerName;
	}
}
