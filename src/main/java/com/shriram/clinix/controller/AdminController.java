package com.shriram.clinix.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.shriram.clinix.model.Admin;
import com.shriram.clinix.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private AdminService adminService;

	@GetMapping(value = "/{id}")
	public Admin getAdmin(@PathVariable long id) {
		try{
			return adminService.getAdmin(id);

		}catch(Exception e){
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "User Already Exists");

		}
	}
	
	public List<Admin> getAAdmin(){
		return Collections.EMPTY_LIST;
	}

}
