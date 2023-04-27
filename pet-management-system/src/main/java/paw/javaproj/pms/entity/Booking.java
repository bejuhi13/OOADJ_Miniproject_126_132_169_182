package paw.javaproj.pms.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "bookings")
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bookingId;
	
	@Column(name = "pet_id", nullable = false)
	private Long petId;
	
	@Column(name = "pet_name")
	private String petName;
	
	@Column(name = "owner_id")
	private Long ownerId;
	
	@Column(name = "booking_date")
	private LocalDateTime bookingDate;
	
	@Column(name = "volunteer_name")
	private String volunteerName;
	
	public Booking() {
		
	}
	
	public Booking(Long petId, String petName, Long ownerId, LocalDateTime bookingDate, String volunteerName) {
		super();
		this.petId = petId;
		this.petName = petName;
		this.ownerId = ownerId;
		this.bookingDate = bookingDate;
		this.volunteerName=volunteerName;
	}
	public Long getId() {
		return bookingId;
	}
	public void setId(Long bookingId) {
		this.bookingId = bookingId;
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
	public LocalDateTime getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(LocalDateTime bookingDate) {
		this.bookingDate = bookingDate;
	}
	public String getVolunteerName() {
		return volunteerName;
	}
	public void setVolunteerName(String volunteerName) {
		this.volunteerName = volunteerName;
	}
}