package com.shriram.clinix.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shriram.clinix.model.MedicareService;
import com.shriram.clinix.service.MedicareServiceService;

@RestController
@RequestMapping("/medicareservice")
public class MedicareServiceController {

	@Autowired
	private MedicareServiceService medicareServiceService;

	@GetMapping()
	public List<MedicareService> getAllMedicareService() {
		return medicareServiceService.getAllMedicareServices();
	}

	@PostMapping()
	public void addMedicareServices(@RequestBody MedicareService medicareService) {
		medicareServiceService.addMedicareServices(medicareService);
	}
	
	public List<MedicareService> getAMedicareService() {
		return Collections.EMPTY_LIST;
	}
	
	public long addMedicareService( MedicareService medicareService) {
		return medicareService.getMedicareServiceId(); 
}
}
