package com.shriram.clinix.constants;

public interface AgentSQLQueries {

	String GET_AGENTS = "SELECT "+ "agent_id, "+ "first_name, "+ "last_name, "+ "age, "+ "gender, "+ "date_of_birth, "
	+ "contact_number, "+ "alt_contact_number, "+ "email_id, "+ "password, "+ "address_line_1, "+ "address_line_2, "+ "city, "
	+ "state, "+ "zipcode, "+ "commission "+ "from "+ "agent;";
	
	String GET_AGENT = "SELECT "+ "agent_id, "+ "first_name, "+ "last_name, "+ "age, "+ "gender, "+ "date_of_birth, "
	+ "contact_number, "+ "alt_contact_number, "+ "email_id, "+ "password, "+ "address_line_1, "+ "address_line_2, "+ "city, "
    + "state, "+ "zipcode, "+ "commission "+ "from "+ "agent "+ "where "+ "agent_id=?;";
	
}
