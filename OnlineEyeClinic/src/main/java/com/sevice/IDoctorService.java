package com.sevice;

import java.util.List;

import com.entity.Appointment;
import com.entity.Doctor;
import com.entity.Test;

public interface IDoctorService {
	Doctor addDoctor(Doctor doctor);
	Doctor updateDoctor(Doctor doctor);
	Doctor deleteDoctor(int doctorId);
	Doctor viewDoctor(int doctorId);
	List<Doctor> viewDoctorsList();
	List<Appointment> viewAppointments();
	Test createTest(Test test);
}
