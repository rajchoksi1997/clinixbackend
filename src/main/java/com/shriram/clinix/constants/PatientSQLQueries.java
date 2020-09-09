package com.shriram.clinix.constants;

public interface PatientSQLQueries {

	String GET_PATIENT = "SELECT " + "patient_id," + "first_name," + "last_name," + "age," + "gender,"
			+ "date_of_birth," + "contact_number," + "alt_contact_number," + "email_id," + "password,"
			+ "address_line_1," + "address_line_2," + "city," + "state," + "zipcode," + "security_question,"
			+ "security_question_answer," + "approve " + "FROM " + "patient " + "WHERE " + "patient_id = ?";

	String UPDATE_PATIENT_APPROVAL = "UPDATE " + "patient " + "SET " + "approve=? " + "WHERE " + "patient_id=?";
}