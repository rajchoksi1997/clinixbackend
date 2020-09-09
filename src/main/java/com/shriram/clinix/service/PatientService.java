package com.shriram.clinix.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.shriram.clinix.controller.AuthenticationController;
import com.shriram.clinix.model.Patient;
import com.shriram.clinix.repository.PatientRepository;

@Component
public class PatientService {
	private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

	@Autowired
	private PatientRepository patientRepository;

	//returns list of all patients
	public List<Patient> getAllPatients() {
		return patientRepository.findAll();
	}

	//get patient by id
	public Patient getPatient(long id) {
		return patientRepository.getPatient(id);
	}

	//update patient approval status
	public void updatePatientApproval(boolean approve, long patient_id) {
		patientRepository.updatePatientApproval(approve, patient_id);
	}

}
