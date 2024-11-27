package com.hexaware.amazecare1.service;

import java.util.List;

import com.hexaware.amazecare1.dto.AppointmentDTO;
import com.hexaware.amazecare1.entities.Appointment;
import com.hexaware.amazecare1.exceptions.AppointmentNotFoundException;
import com.hexaware.amazecare1.exceptions.DoctorNotFoundException;
import com.hexaware.amazecare1.exceptions.PatientNotFoundException;

public interface IAppointmentService {
	  Appointment scheduleAppointment( AppointmentDTO appointmentDTO) throws PatientNotFoundException,DoctorNotFoundException;
	    List<Appointment> findAppointmentByPatientId(Integer patientId) throws PatientNotFoundException;
	    List<Appointment> findAppointmentByDoctorId(Integer doctorId) throws DoctorNotFoundException;
	    int cancelAppointment(int appointmentId) throws AppointmentNotFoundException;
}
