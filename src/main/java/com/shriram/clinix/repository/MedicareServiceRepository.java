package com.shriram.clinix.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.shriram.clinix.constants.MedicareServiceSQLQueries;
import com.shriram.clinix.model.MedicareService;

@Repository
public interface MedicareServiceRepository extends JpaRepository<MedicareService, Integer> {

	@Query(value = MedicareServiceSQLQueries.FIND_MEDICARE_SERVICE, nativeQuery = true)
	Optional<MedicareService> findMedicalService(long id);

}
