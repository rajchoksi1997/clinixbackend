package com.shriram.clinix.constants;

public interface AdminSQLQueries {

	String GET_ADMIN = "SELECT admin_id," + "first_name, " + "last_name, " + "age,gender, " + "date_of_birth, "
			+ "contact_number, " + "alt_contact_number, " + "email_id, " + "password, " + "security_question, "
			+ "security_question_answer " + "from " + "admin " + "where " + "admin_id = ? ";

}
