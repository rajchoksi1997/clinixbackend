package com.shriram.clinix.constants;

public interface DoctorSQLQueries {

	String GET_DOCTOR = "SELECT " + "doctor_id," + "first_name," + "last_name," + "age," + "gender," + "date_of_birth,"
			+ "contact_number," + "alt_contact_number," + "email_id," + "password," + "address_line_1,"
			+ "address_line_2," + "city," + "state," + "zipcode," + "degree," + "speciality," + "work_hours,"
			+ "hospital_name," + "security_question," + "security_question_answer," + "medicare_services," + "approve "
			+ "FROM " + "doctor " + "WHERE " + "doctor_id=?;";
	
	String GET_DOCTORS_APPROVED = "SELECT " + "doctor_id," + "first_name," + "last_name," + "age," + "gender," + "date_of_birth,"
			+ "contact_number," + "alt_contact_number," + "email_id," + "password," + "address_line_1,"
			+ "address_line_2," + "city," + "state," + "zipcode," + "degree," + "speciality," + "work_hours,"
			+ "hospital_name," + "security_question," + "security_question_answer," + "medicare_services," + "approve "
			+ "FROM " + "doctor " + "WHERE " + "approve=true OR approve=1;";
	
	String GET_DOCTORS_BY_MEDICARE_SERVICE = "SELECT " + "doctor_id," + "first_name," + "last_name," + "age,"
			+ "gender," + "date_of_birth," + "contact_number," + "alt_contact_number," + "email_id," + "password,"
			+ "address_line_1," + "address_line_2," + "city," + "state," + "zipcode," + "degree," + "speciality,"
			+ "work_hours," + "hospital_name," + "security_question," + "security_question_answer,"
			+ "medicare_services," + "approve " + "FROM " + "doctor " + "WHERE "
			+ "(approve=true OR approve=1) AND medicare_services=?;";

	String GET_DOCTORS_BY_PATIENT = "SELECT " + "doctor_id," + "first_name," + "last_name," + "age," + "gender,"
			+ "date_of_birth," + "contact_number," + "alt_contact_number," + "email_id," + "password,"
			+ "address_line_1," + "address_line_2," + "city," + "state," + "zipcode," + "degree," + "speciality,"
			+ "work_hours," + "hospital_name," + "security_question," + "security_question_answer,"
			+ "medicare_services," + "approve " + "FROM " + "doctor " + "WHERE " + "(approve=true OR approve=1) "
			+ "AND " + "doctor_id " + "IN " + "(SELECT " + "doctor_id " + "FROM " + "appointment " + "WHERE "
			+ "patient_id=?);";

	String UPDATE_DOCTOR = "UPDATE doctor SET approve=? where doctor_id=?";
}
