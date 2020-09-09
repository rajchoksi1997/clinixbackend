package com.shriram.clinix.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.shriram.clinix.constants.MedicalTestSQLQueries;
import com.shriram.clinix.model.MedicalTest;

@Repository
public interface MedicalTestRepository extends JpaRepository<MedicalTest, Long> {
	
	@Query(value = MedicalTestSQLQueries.VIEW_MEDICAL_TEST_HISTORY, nativeQuery = true)
	MedicalTest viewMedicalTestHistory(String id);
	
}
