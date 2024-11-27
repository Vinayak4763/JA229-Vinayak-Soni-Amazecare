package com.hexaware.amazecare1.service;

import java.util.List;

import com.hexaware.amazecare1.entities.Patient;
import com.hexaware.amazecare1.exceptions.PatientNotFoundException;

public interface IPatientService {
	 Patient registerPatient(Patient patient);
	    String updatePatientInfo(int patientId,Patient patient)throws PatientNotFoundException;

	    // New Patient Methods
	    String deletePatientById(int patientId) throws PatientNotFoundException;
	    Patient getPatientById(int patientId) throws PatientNotFoundException;
	    List<Patient> getByPatientName(String patientName) throws PatientNotFoundException;
        
}
