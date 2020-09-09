package com.shriram.clinix.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.shriram.clinix.constants.PatientSQLQueries;
import com.shriram.clinix.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

	@Query(value = PatientSQLQueries.GET_PATIENT, nativeQuery = true)
	Patient getPatient(long id);

	@Modifying
	@Transactional
	@Query(value = PatientSQLQueries.UPDATE_PATIENT_APPROVAL, nativeQuery = true)
	Integer updatePatientApproval(boolean approve, long patient);

}
