package com.hexaware.amazecare1.entities;


import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Patient")
public class Patient {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="patient_id")
    private int patientId;

    @Column(nullable = false)
    @Pattern(regexp = "[A-Z][a-z]+",message = "patientName must begin with Uppercase")
    private String patientName;
    @Past
    private LocalDate dob;
    @NotNull(message = "Gender is required")
    private String gender;
    @Size(min=10,max=10, message = "Contact must be exactly 10 digits")
    private String contact;
    @NotNull(message = "Symptoms is required")
    private String symptoms;
    @NotNull(message = "Nature of Visit is required")
    private String natureOfVisit;
    @Future
    private LocalDate preferredDate;
   
    public Patient() {
        super();
    }
   
   



	public Patient(int patientId,
			@Pattern(regexp = "[A-Z][a-z]+", message = "patientName must begin with Uppercase") String patientName,
			@Past LocalDate dob, @NotNull(message = "Gender is required") String gender,
			 @Size(min=10,max=10, message = "Contact must be exactly 10 digits") String contact,
			@NotNull(message = "Symptoms is required") String symptoms,
			@NotNull(message = "Nature of Visit is required") String natureOfVisit, @Future LocalDate preferredDate) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.dob = dob;
		this.gender = gender;
		this.contact = contact;
		this.symptoms = symptoms;
		this.natureOfVisit = natureOfVisit;
		this.preferredDate = preferredDate;
	}





	// Getters and setters
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public @Past LocalDate getDob() {
        return dob;
    }

    public void setDob(@Past LocalDate dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    

    public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getNatureOfVisit() {
        return natureOfVisit;
    }

    public void setNatureOfVisit(String natureOfVisit) {
        this.natureOfVisit = natureOfVisit;
    }

    public @Future LocalDate getPreferredDate() {
        return preferredDate;
    }

    public void setPreferredDate(@Future LocalDate preferredDate) {
        this.preferredDate = preferredDate;
    }

  

    
    @Override
    public String toString() {
        return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", dob=" + dob + ", gender=" + gender 
                + ", contact=" + contact + ", symptoms=" + symptoms + ", natureOfVisit=" + natureOfVisit 
                + ", preferredDate=" + preferredDate + "]";
    }
}
