package com.shriram.clinix.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shriram.clinix.controller.AuthenticationController;
import com.shriram.clinix.model.Admin;
import com.shriram.clinix.repository.AdminRepository;

@Component
public class AdminService {
	private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

	@Autowired
	private AdminRepository adminRepository;

	//returns the information of admin with specified id
	public Admin getAdmin(long id) {
		return adminRepository.getAdmin(id);
	}

}
