package com.shriram.clinix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.shriram.clinix.model.Admin;
import com.shriram.clinix.model.Agent;
import com.shriram.clinix.model.Doctor;
import com.shriram.clinix.model.Patient;
import com.shriram.clinix.model.User;
import com.shriram.clinix.service.AppUser;
import com.shriram.clinix.service.AppUserDetailService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private AppUserDetailService appUserDetailService;

	@PostMapping("/admin")
	public void signupAdmin(@RequestBody Admin admin) {
		try {
			System.out.println(admin);
			appUserDetailService.signUpAdmin(admin);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "User Already Exists");
		}

	}

	@PostMapping("/doctor")
	public void signupDoctor(@RequestBody Doctor doctor) {
		try {
			System.out.println(doctor);
			appUserDetailService.signUpDoctor(doctor);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "User Already Exists");
		}

	}

	@PostMapping("/patient")
	public void signupPatient(@RequestBody Patient patient) {
		try {
			System.out.println(patient);
			appUserDetailService.signUpPatient(patient);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "User Already Exists");
		}

	}

	@PostMapping("/agent")
	public void signupAgent(@RequestBody Agent agent) {
		try {
			System.out.println(agent);
			appUserDetailService.signUpAgent(agent);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "User Already Exists");
		}

	}

	@GetMapping("/{username}")
	public long getUsersId(@PathVariable String username) {
		AppUser userDetails = (AppUser) appUserDetailService.loadUserByUsername(username);
		User user = userDetails.getUser();
		return user.getUserId();
	}

}
