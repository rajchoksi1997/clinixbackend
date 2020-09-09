package com.shriram.clinix.constants;

public interface MedicalTestSQLQueries {

	String VIEW_MEDICAL_TEST_HISTORY = "SELECT " + "report_id," + "patient_id," + "doctor_id," + "agent_id,"
			+ "test_result_date," + "diag_name_1," + "diag_name_2," + "diag_name_3," + "diag_name_4," + "diag_name_5,"
			+ "diag_name_6," + "diag_actual_value_1," + "diag_actual_value_2," + "diag_actual_value_3,"
			+ "diag_actual_value_4," + "diag_actual_value_5," + "diag_actual_value_6," + "diag_normal_range_1,"
			+ "diag_normal_range_2," + "diag_normal_range_3," + "diag_normal_range_4," + "diag_normal_range_5,"
			+ "diag_normal_range_6, " + "doctor_comments," + "other_info," + "appointment_id " + "FROM "
			+ "medical_test_history " + "WHERE " + "appointment_id=?";
}
