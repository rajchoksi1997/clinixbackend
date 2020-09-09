package com.shriram.clinix.service;

import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import com.shriram.clinix.controller.AuthenticationController;
import com.shriram.clinix.model.Doctor;
import com.shriram.clinix.model.MedicalTest;
import com.shriram.clinix.model.MedicareService;
import com.shriram.clinix.repository.DoctorRepository;
import com.shriram.clinix.repository.MedicalTestRepository;

@Component
public class DoctorService {
	private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

	@Autowired
	private DoctorRepository doctorRepository;
	@Autowired
	private MedicalTestRepository medicalTestRepository;

	//returns list of all doctors 
	public List<Doctor> getAllDoctors() {
		return doctorRepository.findAll();
	}

	//returns list of all doctors approved by admin
	public List<Doctor> getAllUserDoctors() {
		return doctorRepository.getAllDoctorsForUser();
	}

	//update approval status of doctors
	public void updateDoctorApproval(boolean approve, long doctor_id) {
		doctorRepository.updateDoctorApproval(approve, doctor_id);
	}

	//returns list of doctors with specified medicare service
	public List<Doctor> getDoctorsByMedicareService(MedicareService medicareService) {
		return doctorRepository.getAllDoctorsForMedicareService(medicareService);
	}

	//returns information of doctor with specified id
	public Doctor getDoctor(long id) {
		return doctorRepository.getDoctor(id);
	}

	//returns list of doctor with specified patient id
	public List<Doctor> getDoctorNames(long patientId) {
		return doctorRepository.getDoctorNames(patientId);
	}

	//updates the test result
	public void updateTestResult(MedicalTest medicalTest) {
		Random rand = new Random();
		long id = rand.nextInt(10000);
		medicalTest.setReportId(id);
		medicalTestRepository.save(medicalTest);
		System.out.println(medicalTest);
	}

}
