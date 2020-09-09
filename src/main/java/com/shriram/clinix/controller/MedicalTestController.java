package com.shriram.clinix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shriram.clinix.model.MedicalTest;
import com.shriram.clinix.service.MedicalTestService;

@RestController
@RequestMapping("/medicaltest")
public class MedicalTestController {

	@Autowired
	private MedicalTestService medicalTestService;

	@GetMapping("/{id}")
	public MedicalTest getMedicalTest(@PathVariable String id) {
		return medicalTestService.viewMedicalTestHistory(id);
	}

}
