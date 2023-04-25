package paw.javaproj.pms.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "pet_bookings")

public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long  book_id;
	
	@Column(name = "Date Created", nullable = false)
	private LocalDateTime dateCreated;
	
	@Column(name = "Owner ID", nullable=false)
	private Long owner_id;
	
	@Column(name = "Pet ID", nullable = false)
	private Long pet_id;
	
	@Column(name = "Pet Name", nullable = false)
	private String pet_name;
	
	@Column(name = "Booking Date", nullable = false)
	private LocalDateTime booking_time;
	
	@Column(name = "Pet Name")
	private String volunteer_assigned;
	
	public Booking() {
		
	}
	
	public Booking(LocalDateTime dateCreated, Long owner_id, Long pet_id, String pet_name,LocalDateTime booking_time,String volunteer_assigned) 
	{
		super();
		this.dateCreated = dateCreated;
		this.owner_id = owner_id;
		this.pet_id = pet_id;
		this.pet_name = pet_name;
		this.booking_time=booking_time;
		this.volunteer_assigned = volunteer_assigned;
	}
	public Long getBookId() {
		return book_id;
	}
	public void setBookId(Long book_id) {
		this.book_id = book_id;
	}
	public LocalDateTime getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(LocalDateTime dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Long getOwnerId() {
		return owner_id;
	}
	public void setOwnerId(Long owner_id) {
		this.owner_id = owner_id;
	}
	public Long getPetId() {
		return pet_id;
	}
	public void setPetId(Long pet_id) {
		this.pet_id = pet_id;
	}
	public String getPetName() {
		return pet_name;
	}
	public void setPetName(String pet_name) {
		this.pet_name = pet_name;
	}
	public LocalDateTime getBookingTime() {
		return booking_time;
	}
	public void setBookingTime(LocalDateTime booking_time) {
		this.booking_time = booking_time;
	}
	public String getVolunteer() {
		return volunteer_assigned;
	}
	public void setVolunteer(String volunteer_assigned) {
		this.volunteer_assigned = volunteer_assigned;
	}
}