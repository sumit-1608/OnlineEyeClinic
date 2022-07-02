package com.sevice;

import java.util.List;

import com.entity.Appointment;
import com.entity.Patient;
import com.entity.Report;
import com.exceptions.AppointmentIdNotFoundException;
import com.exceptions.PatientIdFoundNotException;

public interface IPatientService {
	Patient addPatient(Patient patient);
	Patient updatePatient(Patient patient);
	Patient deletePatient(int patientId)throws PatientIdFoundNotException;
	List<Patient> viewPatientList();
	Patient viewPatient(int patientId)throws PatientIdFoundNotException;
	Appointment bookAppointment(Appointment appointment);
	Appointment viewAppointmentDetails(int appointmentid)throws AppointmentIdNotFoundException;
	Report viewReport(int patientId)throws PatientIdFoundNotException;
}
