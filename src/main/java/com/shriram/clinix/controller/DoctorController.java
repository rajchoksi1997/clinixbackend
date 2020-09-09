package com.shriram.clinix.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shriram.clinix.model.Doctor;
import com.shriram.clinix.model.MedicalTest;
import com.shriram.clinix.model.MedicareService;
import com.shriram.clinix.service.DoctorService;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

	@Autowired
	private DoctorService doctorService;

	@GetMapping()
	public List<Doctor> getAllDoctors() {
		return doctorService.getAllDoctors();
	}

	@GetMapping("/user/")
	public List<Doctor> getAllUserDoctors() {
		return doctorService.getAllUserDoctors();
	}

	@PutMapping("/status/")
	public void updateDoctorApproval(@RequestBody Doctor doctor) {
		doctorService.updateDoctorApproval(doctor.isApprove(), doctor.getDoctorId());
	}

	@PostMapping(value = "/medicareservice/")
	public List<Doctor> getDoctorsByMedicareService(@RequestBody MedicareService medicareService) {
		return doctorService.getDoctorsByMedicareService(medicareService);
	}

	@GetMapping(value = "/{id}")
	public Doctor getDoctor(@PathVariable long id) {
		return doctorService.getDoctor(id);
	}

	@GetMapping(value = "/patients/{patientId}")
	public List<Doctor> getDoctorNames(@PathVariable("patientId") long patientId) {
		return doctorService.getDoctorNames(patientId);
	}

	@PostMapping(value = "/medicaltest")
	public void updateTestResult(@RequestBody MedicalTest medicalTest) {
		doctorService.updateTestResult(medicalTest);
	}
	
	public List<Doctor> getADoctor(){
		return Collections.EMPTY_LIST;
	}

}
