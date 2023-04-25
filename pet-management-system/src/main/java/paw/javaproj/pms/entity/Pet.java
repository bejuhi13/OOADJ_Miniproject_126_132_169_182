package paw.javaproj.pms.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "pet")

public class Pet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pet_id;
	
	@Column(name = "Pet Name", nullable = false)
	private String pet_name;
	
	@Column(name = "Pet Breed")
	private String pet_breed;
	
	@Column(name = "Pet Owner")
	private String pet_owner;
	
	@Column(name = "Pet Medical History")
	private String pet_medHistory;
	
	public Pet() {
		
	}
	
	public Pet(String pet_name, String pet_breed, String pet_owner, String pet_medHistory) {
		super();
		this.pet_name = pet_name;
		this.pet_breed = pet_breed;
		this.pet_owner = pet_owner;
		this.pet_medHistory = pet_medHistory;
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
	public String getPetBreed() {
		return pet_breed;
	}
	public void setPetBreed(String pet_breed) {
		this.pet_breed = pet_breed;
	}
	public String getPetOwner() {
		return pet_owner;
	}
	public void setPetOwner(String pet_owner) {
		this.pet_owner = pet_owner;
	}
	public String getMedHistory() {
		return pet_medHistory;
	}
	public void setMedHistory(String pet_medHistory) {
		this.pet_medHistory = pet_medHistory;
	}
}