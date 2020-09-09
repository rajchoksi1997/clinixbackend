package com.shriram.clinix.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shriram.clinix.model.Agent;
import com.shriram.clinix.service.AgentService;

@RestController
@RequestMapping("/agents")
public class AgentController {

	@Autowired
	private AgentService agentService;

	@GetMapping()
	public List<Agent> getAllAgents() {
		return agentService.getAllAgents();
	}

	@PostMapping()
	public void addAgent(@RequestBody Agent agent) {
		agentService.addAgent(agent);
	}

	@GetMapping(value = "/{id}")
	public Agent getAgent(@PathVariable long id) {
		return agentService.getAgent(id);
	}
	
	public List<Agent> getAAgent(){
		return Collections.EMPTY_LIST;
	}
	
	public List<Agent> getAgentt(long id){
		return Collections.EMPTY_LIST;
	}
	
	public List<Agent> addNewAgent(Agent agent){
		return Collections.EMPTY_LIST;
	}

}
