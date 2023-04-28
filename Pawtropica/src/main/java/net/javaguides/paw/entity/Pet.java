package net.javaguides.paw.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "pets")
public class Pet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "petname")
	private String petName;
	
	@Column(name = "pettype")
	public String petType;
	
	@Column(name = "petowner")
	private String petOwner;
	
	@Column(name = "medhistory")
	private String medHistory;
	
	public Pet() {
		
	}
	
	public Pet(String petName, String petBreed, String petOwner, String medHistory) {
		super();
		this.petName = petName;
		this.petType = petType;
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
	public String getPetType() {
		return petType;
	}
	public void setPetType(String petType) {
		this.petType = petType;
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
	public String getPetTypeFact()
	{
		if(petType.equals("dog")) {
			Dog dog = new Dog();
			return dog.checkType(petType);
		}
		else if(petType.equals("cat")) {
			Cat cat = new Cat();
			return cat.checkType(petType);
		}
		else{
			Dog dog = new Dog();
			return dog.checkType(petType);
		}
	}
}

