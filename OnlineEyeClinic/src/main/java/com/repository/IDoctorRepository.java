package com.repository;

import java.util.List;

import com.entity.Appointment;
import com.entity.Doctor;
import com.entity.Test;
import com.exceptions.DoctorIdNotFoundException;



public interface IDoctorRepository {
	Doctor addDoctor(Doctor doctor);
	Doctor updateDoctor(Doctor doctor);
	Doctor deleteDoctor(int doctorId)throws DoctorIdNotFoundException;
	Doctor viewDoctor(int doctorId)throws DoctorIdNotFoundException;
	List<Doctor> viewDoctorsList();
	List<Appointment> viewAppointments();
	Test createTest(Test test);
}
