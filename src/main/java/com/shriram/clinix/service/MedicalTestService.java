package com.shriram.clinix.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shriram.clinix.controller.AuthenticationController;
import com.shriram.clinix.model.MedicalTest;
import com.shriram.clinix.repository.MedicalTestRepository;

@Component
public class MedicalTestService {
	private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

	@Autowired
	private MedicalTestRepository medicalTestRepository;

	// returns medical test history with specified appointment id
	public MedicalTest viewMedicalTestHistory(String id) {
		return medicalTestRepository.viewMedicalTestHistory(id);
	}

}
