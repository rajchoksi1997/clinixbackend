package com.shriram.clinix.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.shriram.clinix.constants.DoctorSQLQueries;
import com.shriram.clinix.model.Doctor;
import com.shriram.clinix.model.MedicareService;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

	@Query(value = DoctorSQLQueries.GET_DOCTOR, nativeQuery = true)
	Doctor getDoctor(long id);

	@Query(value = DoctorSQLQueries.GET_DOCTORS_APPROVED, nativeQuery = true)
	List<Doctor> getAllDoctorsForUser();

	@Modifying
	@Transactional
	@Query(value = DoctorSQLQueries.UPDATE_DOCTOR, nativeQuery = true)
	Long updateDoctorApproval(boolean approve, long doctor);

	@Query(value = DoctorSQLQueries.GET_DOCTORS_BY_MEDICARE_SERVICE, nativeQuery = true)
	List<Doctor> getAllDoctorsForMedicareService(MedicareService ms);

	@Query(value = DoctorSQLQueries.GET_DOCTORS_BY_PATIENT, nativeQuery = true)
	List<Doctor> getDoctorNames(long patientId);
}
