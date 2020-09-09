package com.shriram.clinix.service;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.shriram.clinix.controller.AuthenticationController;
import com.shriram.clinix.model.Agent;
import com.shriram.clinix.model.Doctor;
import com.shriram.clinix.repository.AgentRepository;

@Component
public class AgentService {
	private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

	@Autowired
	private AgentRepository agentRepository;

	//returns the list of all approved agents
	public List<Agent> getAllAgents() {
		return agentRepository.findAll();
	}

	//add the new entry in agents
	public void addAgent(Agent agent) {
		agentRepository.save(agent);
	}

	//returns the information of agent with specified id
	public Agent getAgent(long id) {
		return agentRepository.getAgent(id);
	}

}
