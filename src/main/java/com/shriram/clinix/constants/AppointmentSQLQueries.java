package com.shriram.clinix.constants;

public interface AppointmentSQLQueries {

	String APPOINTMENTS_BY_TIME_SLOT = "SELECT " + "appointment_id, " + "doctor_id, " + "agent_id, " + "time_slot, "
			+ "date_of_appointment, " + "patient_id  " + "FROM " + "appointment " + "WHERE " + "time_slot=? "
			+ "ORDER BY " + "time_slot;";

	String APPOINTMENTS_BY_PRIORITY = "SELECT " + "appointment_id, " + "doctor_id, " + "agent_id, " + "time_slot, "
			+ "date_of_appointment, " + "patient_id  " + "FROM " + "appointment " + "WHERE " + "time_slot=? "
			+ "ORDER BY " + "agent_id " + "DESC;";

	String GET_APPOINTMENTS = "SELECT " + "appointment_id, " + "doctor_id, " + "agent_id, " + "time_slot, "
			+ "date_of_appointment, " + "patient_id, " + "status  " + "FROM " + "appointment " + "WHERE "
			+ "appointment_id=?";

	String APPOINTMENTS_BY_PATIENT = "SELECT " + "appointment_id, " + "doctor_id, " + "agent_id, " + "time_slot, "
			+ "date_of_appointment, " + "patient_id, " + "status  " + "FROM " + "appointment " + "WHERE "
			+ "patient_id=?;";

	String APPOINTMENTS_BY_PATIENT_UPCOMING = "SELECT " + "appointment_id, " + "doctor_id, " + "agent_id, "
			+ "time_slot, " + "date_of_appointment, " + "patient_id, " + "status  " + "FROM " + "appointment "
			+ "WHERE " + "patient_id=? " + "and " + "date_of_appointment >= NOW();";

	String APPOINTMENTS_BY_PATIENT_PAST = "SELECT " + "appointment_id, " + "doctor_id, " + "agent_id, " + "time_slot, "
			+ "date_of_appointment, " + "patient_id, " + "status  " + "FROM " + "appointment " + "WHERE "
			+ "patient_id=? " + "and " + "date_of_appointment < NOW() " + "and " + "status='completed';";

	String UPDATE_APPOINTMENT_APPROVAL = "UPDATE " + "appointment " + "SET " + "status=? " + "where "
			+ "appointment_id=?;";

	String APPOINTMENTS_BY_DOCTOR = "SELECT " + "appointment_id, " + "doctor_id, " + "agent_id, " + "time_slot, "
			+ "date_of_appointment, " + "patient_id, " + "status  " + "FROM " + "appointment " + "WHERE "
			+ "doctor_id=?";

	String APPOINTMENTS_BY_DOCTOR_UPCOMING = "SELECT " + "appointment_id, " + "doctor_id, " + "agent_id, "
			+ "time_slot, " + "date_of_appointment, " + "patient_id, " + "status  " + "FROM " + "appointment "
			+ "WHERE " + "doctor_id=? " + "and " + "date_of_appointment > NOW();";

	String APPOINTMENTS_BY_DOCTOR_PAST = "SELECT " + "appointment_id, " + "doctor_id, " + "agent_id, " + "time_slot, "
			+ "date_of_appointment, " + "patient_id, " + "status  " + "FROM " + "appointment " + "WHERE "
			+ "doctor_id=? " + "and " + "date_of_appointment <= NOW();";

	String APPOINTMENTS_BY_AGENT = "SELECT " + "appointment_id, " + "doctor_id, " + "agent_id, " + "time_slot, "
			+ "date_of_appointment, " + "patient_id, " + "status " + "FROM " + "appointment " + "WHERE "
			+ "agent_id=?;";

}
