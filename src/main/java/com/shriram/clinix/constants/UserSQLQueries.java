package com.shriram.clinix.constants;

public interface UserSQLQueries {

	String FIND_BY_USERNAME = "SELECT " + "id," + "first_name," + "last_name," + "age," + "gender,"
			+ "date_of_birth," + "contact," + "alt_contact," + "email," + "password,"
			+ "security_que," + "security_ans " + "FROM " + "user " + "WHERE " + "email=?";

	String ADD_NEW_USER = "INSERT " + "INTO " + "user" + "(id," + "first_name," + "last_name,"
			+ "age," + "gender," + "date_of_birth," + "contact," + "alt_contact," + "email,"
			+ "password," + "security_que," + "security_ans) " + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";

	String ADD_NEW_ADMIN = "INSERT " + "INTO " + "admin" + "(admin_id," + "first_name,"
			+ "last_name," + "age," + "gender," + "date_of_birth," + "contact_number,"
			+ "alt_contact_number," + "email_id," + "password," + "security_question,"
			+ "security_question_answer) " + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";

	String ADD_NEW_DOCTOR = "INSERT " + "INTO " + "doctor" + "(doctor_id," + "first_name,"
			+ "last_name," + "age," + "gender," + "date_of_birth," + "contact_number,"
			+ "alt_contact_number," + "email_id," + "password," + "address_line_1,"
			+ "address_line_2," + "city," + "state," + "zipcode," + "degree," + "speciality,"
			+ "work_hours," + "hospital_name," + "security_question," + "security_question_answer,"
			+ "medicare_services," + "approve) "
			+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

	String ADD_NEW_PATIENT = "INSERT " + "INTO " + "patient" + "(patient_id," + "first_name,"
			+ "last_name," + "age," + "gender," + "date_of_birth," + "contact_number,"
			+ "alt_contact_number," + "email_id," + "password," + "address_line_1,"
			+ "address_line_2," + "city," + "state," + "zipcode," + "security_question,"
			+ "security_question_answer," + "approve) "
			+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

	String ADD_USER_ROLE = "INSERT " + "INTO " + "user_role " + "(ur_us_id, " + "ur_ro_id) "
			+ "VALUES (?,?)";

	String ADD_NEW_AGENT = "INSERT " + "INTO " + "agent " + "(agent_id," + "first_name,"
			+ "last_name," + "age," + "gender," + "date_of_birth," + "contact_number,"
			+ "alt_contact_number," + "email_id," + "password," + "address_line_1,"
			+ "address_line_2," + "city," + "state," + "zipcode," + "commission) "
			+ "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
}
