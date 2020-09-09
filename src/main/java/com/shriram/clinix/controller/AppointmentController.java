package com.shriram.clinix.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shriram.clinix.model.Agent;
import com.shriram.clinix.model.Appointment;
import com.shriram.clinix.model.Doctor;
import com.shriram.clinix.service.AppointmentService;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

	@Autowired
	private AppointmentService appointmentService;
	
	@PostMapping()
	public void addAppointmentRequest(@RequestBody Appointment appointment){
		appointmentService.bookAppointment(appointment);
	}
	
	@GetMapping("/patient/{id}")
	public List<Appointment> getAllAppointmentsForPatient(@PathVariable long id){
		return appointmentService.appointmentsByPatient(id);
	}
	
	@GetMapping("/patient/future/{id}")
	public List<Appointment> getAllappointmentsByPatientUpcoming(@PathVariable long id){
		return appointmentService.appointmentsByPatientUpcoming(id);	
	}
	
	@GetMapping("/patient/past/{id}")
	public List<Appointment> getAllappointmentsByPatientPast(@PathVariable long id){
		return appointmentService.appointmentsByPatientPast(id);	
	}
	
	@PostMapping("/doctor/")
	public List<Appointment> getAllAppointmentsForDoctor(@RequestBody Doctor doc){
		return appointmentService.appointmentByDoctor(doc);
	}
	@PostMapping("/doctor/future/")
	public List<Appointment> getAllAppointmentsForDoctorUpcoming(@RequestBody Doctor doc){
		return appointmentService.getAllAppointmentsForDoctorUpcoming(doc);
	}
	@PostMapping("/doctor/past/")
	public List<Appointment> getAllAppointmentsForDoctorPast(@RequestBody Doctor doc){
		return appointmentService.getAllAppointmentsForDoctorPast(doc);
	}
	
	@PostMapping("/agent/")
	public List<Appointment> getAllAppointmentsForAgent(@RequestBody Agent agent){
		return appointmentService.appointmentByAgent(agent);
	}
	
	@PutMapping("/status/")
	 public void updateDoctorApproval(@RequestBody Appointment appointment){
		appointmentService.updateAppointmentApproval(appointment.getStatus(),appointment.getAppointmentId());
	 }
	
	@PostMapping("/id/")
	public long getAppointmetId(@RequestBody Appointment appointment){
		return appointmentService.getAppointmetId(appointment);
	}
	
	@GetMapping("/{id}")
	public Appointment getAppointment(@PathVariable long id){
		return appointmentService.getAppointment(id);	
	}
	
	
}
