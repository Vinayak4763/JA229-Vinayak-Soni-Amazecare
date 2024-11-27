package com.hexaware.amazecare1.service;

import java.util.List;

import com.hexaware.amazecare1.dto.PrescribeMedicationDTO;
import com.hexaware.amazecare1.entities.PrescribeMedication;
import com.hexaware.amazecare1.exceptions.DoctorNotFoundException;
import com.hexaware.amazecare1.exceptions.PatientNotFoundException;
import com.hexaware.amazecare1.exceptions.PrescriptionNotFoundException;

public interface IPrescribeMedicationService {
	PrescribeMedication prescribeMedications(PrescribeMedicationDTO presDTO)throws PatientNotFoundException,DoctorNotFoundException;
    PrescribeMedication getPrescriptionById(int pid) throws PrescriptionNotFoundException;
    List<PrescribeMedication> viewAllPrescriptions();
    List<PrescribeMedication>  findPrescriptionByPatientId(Integer patientId) throws PatientNotFoundException;
}
