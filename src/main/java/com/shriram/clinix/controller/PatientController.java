package com.shriram.clinix.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shriram.clinix.model.Patient;
import com.shriram.clinix.service.PatientService;

@RestController
@RequestMapping("/patients")
public class PatientController {

	@Autowired
	private PatientService patientService;

	@GetMapping()
	public List<Patient> getAllPatients() {
		return patientService.getAllPatients();
	}

	@GetMapping(value = "/{id}")
	public Patient getPatient(@PathVariable long id) {
		return patientService.getPatient(id);
	}

	@PutMapping()
	public void updatePatientApproval(@RequestBody Patient patient) {
		patientService.updatePatientApproval(patient.isApprove(), patient.getPatientId());
	}

	public List<Patient> getAPatients() {
		return Collections.EMPTY_LIST;
	}
	
	public List<Patient> getPatientt(long id){
		return Collections.EMPTY_LIST;
	}


}
