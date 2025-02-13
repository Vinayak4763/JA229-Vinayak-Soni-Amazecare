package com.hexaware.amazecare1.service;

import java.util.List;

import com.hexaware.amazecare1.entities.Doctor;
import com.hexaware.amazecare1.exceptions.DoctorNotFoundException;

public interface IDoctorService {
	
	
	    Doctor registerDoctor(Doctor doctor);
	    String updateDoctor(int doctorId,Doctor doctor) throws DoctorNotFoundException;
	    Doctor getDoctorById(int did) throws DoctorNotFoundException;
	    String deleteDoctorById(int did) throws DoctorNotFoundException;
	    List<Doctor> getByDoctorName(String doctorName) throws DoctorNotFoundException;
	    List<Doctor> viewAllDoctors();
}
