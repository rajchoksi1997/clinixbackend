package com.shriram.clinix.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.shriram.clinix.constants.AppointmentSQLQueries;
import com.shriram.clinix.model.Agent;
import com.shriram.clinix.model.Appointment;
import com.shriram.clinix.model.Doctor;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {

	@Query(value = AppointmentSQLQueries.APPOINTMENTS_BY_TIME_SLOT, nativeQuery = true)
	List<Appointment> AppointmentsByTimeSlot();

	@Query(value = AppointmentSQLQueries.APPOINTMENTS_BY_PRIORITY, nativeQuery = true)
	List<Appointment> appointmentsByPriority();

	@Query(value = AppointmentSQLQueries.GET_APPOINTMENTS, nativeQuery = true)
	Appointment getAppointment(long id);

	@Query(value = AppointmentSQLQueries.APPOINTMENTS_BY_PATIENT, nativeQuery = true)
	List<Appointment> appointmentsByPatient(long id);

	@Query(value = AppointmentSQLQueries.APPOINTMENTS_BY_PATIENT_UPCOMING, nativeQuery = true)
	List<Appointment> appointmentsByPatientUpcoming(long id);

	@Query(value = AppointmentSQLQueries.APPOINTMENTS_BY_PATIENT_PAST, nativeQuery = true)
	List<Appointment> appointmentsByPatientPast(long id);

	@Modifying
	@Transactional
	@Query(value = AppointmentSQLQueries.UPDATE_APPOINTMENT_APPROVAL, nativeQuery = true)
	Integer updateAppointmentApproval(String status, long app_id);

	@Query(value = AppointmentSQLQueries.APPOINTMENTS_BY_DOCTOR, nativeQuery = true)
	List<Appointment> appointmentsByDoctor(Doctor doctor);

	@Query(value = AppointmentSQLQueries.APPOINTMENTS_BY_DOCTOR_UPCOMING, nativeQuery = true)
	List<Appointment> appointmentsByDoctorUpcoming(Doctor doctor);

	@Query(value = AppointmentSQLQueries.APPOINTMENTS_BY_DOCTOR_PAST, nativeQuery = true)
	List<Appointment> appointmentsByDoctorPast(Doctor doctor);

	@Query(value = AppointmentSQLQueries.APPOINTMENTS_BY_AGENT, nativeQuery = true)
	List<Appointment> appointmentsByAgent(Agent agent);
}
