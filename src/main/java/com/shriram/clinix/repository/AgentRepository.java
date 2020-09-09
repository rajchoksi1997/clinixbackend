package com.shriram.clinix.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.shriram.clinix.constants.AgentSQLQueries;
import com.shriram.clinix.model.Agent;

@Repository
public interface AgentRepository extends JpaRepository<Agent, Long> {

	@Query(value = AgentSQLQueries.GET_AGENTS, nativeQuery = true)
	List<Agent> getAllAgents();
	
	@Query(value = AgentSQLQueries.GET_AGENT, nativeQuery = true)
	Agent getAgent(long id);

}
