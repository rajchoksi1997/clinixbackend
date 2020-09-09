package com.shriram.clinix.service;

import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.shriram.clinix.controller.AuthenticationController;
import com.shriram.clinix.model.MedicareService;
import com.shriram.clinix.model.Patient;
import com.shriram.clinix.repository.MedicareServiceRepository;
import com.shriram.clinix.repository.PatientRepository;

@Component
public class MedicareServiceService {
	private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

	@Autowired
	private MedicareServiceRepository medicareServiceRepository;

	// returns list of all medicare services
	public List<MedicareService> getAllMedicareServices() {
		return medicareServiceRepository.findAll();
	}

	//add medicare services
	public void addMedicareServices(MedicareService medicareService) {
		Random rand = new Random();
		long id = rand.nextInt(10000);
		medicareService.setMedicareServiceId(id);
		medicareServiceRepository.save(medicareService);
	}

}
