package com.repository;

import java.time.LocalDate;
import java.util.List;

import com.entity.Appointment;
import com.exceptions.AppointmentIdNotFoundException;
import com.exceptions.InvalidAppointmentException;

public interface IAppointmentRepository {
	Appointment bookAppointment(Appointment appointment);
	Appointment updateAppointment(Appointment appointment)throws InvalidAppointmentException;
	Appointment cancelAppointment(int appointmentId)throws AppointmentIdNotFoundException;
	Appointment viewAppointment(int appointmentId)throws AppointmentIdNotFoundException;
	List<Appointment> viewAllAppointments();
	List<Appointment> viewAppointments(LocalDate date);
}
