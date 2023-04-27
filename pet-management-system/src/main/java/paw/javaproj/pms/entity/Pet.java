package paw.javaproj.pms.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "pets")
public class Pet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "pet_name")
	private String petName;
	
	@Column(name = "pet_breed")
	private String petBreed;
	
	@Column(name = "pet_owner")
	private String petOwner;
	
	@Column(name = "pet_medHistory")
	private String medHistory;
	
	public Pet() {
		
	}
	
	public Pet(String petName, String petBreed, String petOwner, String medHistory) {
		super();
		this.petName = petName;
		this.petBreed = petBreed;
		this.petOwner = petOwner;
		this.medHistory = medHistory;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long petId) {
		this.id = petId;
	}
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public String getPetBreed() {
		return petBreed;
	}
	public void setPetBreed(String petBreed) {
		this.petBreed = petBreed;
	}
	public String getPetOwner() {
		return petOwner;
	}
	public void setPetOwner(String petOwner) {
		this.petOwner = petOwner;
	}
	public String getMedHistory() {
		return medHistory;
	}
	public void setMedHistory(String medHistory) {
		this.medHistory = medHistory;
	}
}
