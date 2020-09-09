package com.shriram.clinix.service;

import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.shriram.clinix.controller.AuthenticationController;
import com.shriram.clinix.model.Agent;
import com.shriram.clinix.model.Appointment;
import com.shriram.clinix.model.Doctor;
import com.shriram.clinix.repository.AppointmentRepository;

@Component
public class AppointmentService {
	private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

	@Autowired
	private AppointmentRepository appointmentRepository;

	//book appointment
	public void bookAppointment(Appointment appointment) {
		Random rand = new Random();
		long id = rand.nextInt(10000);
		appointment.setAppointmentId(id);
		appointmentRepository.save(appointment);
	}

	//returns  list of appointments of specified patient id
	public List<Appointment> appointmentsByPatient(long patientId) {
		return appointmentRepository.appointmentsByPatient(patientId);
	}

	//returns  list of upcoming appointments of specified patient id
	public List<Appointment> appointmentsByPatientUpcoming(long patientId) {
		return appointmentRepository.appointmentsByPatientUpcoming(patientId);
	}
	
	//returns  list of past appointments of specified patient id
	public List<Appointment> appointmentsByPatientPast(long patientId) {
		return appointmentRepository.appointmentsByPatientPast(patientId);
	}

	//returns  list of appointments of specified doctor
	public List<Appointment> appointmentByDoctor(Doctor doct) {
		return appointmentRepository.appointmentsByDoctor(doct);
	}

	//returns list of appointments booked by specified agent
	public List<Appointment> appointmentByAgent(Agent agent) {
		return appointmentRepository.appointmentsByAgent(agent);
	}

	//updates the approval status of appointment
	public void updateAppointmentApproval(String status, long app_id) {
		appointmentRepository.updateAppointmentApproval(status, app_id);
	}

	//get appointment id
	public long getAppointmetId(Appointment appointment) {
		return appointment.getAppointmentId();
	}

	//get appointment by id
	public Appointment getAppointment(@PathVariable long id) {
		return appointmentRepository.getAppointment(id);
	}

	//returns list of upcoming appointments of specified doctor id
	public List<Appointment> getAllAppointmentsForDoctorUpcoming(@RequestBody Doctor doc) {
		return appointmentRepository.appointmentsByDoctorUpcoming(doc);
	}

	//returns list of past appointments of specified doctor id
	public List<Appointment> getAllAppointmentsForDoctorPast(@RequestBody Doctor doc) {
		return appointmentRepository.appointmentsByDoctorPast(doc);
	}

}
