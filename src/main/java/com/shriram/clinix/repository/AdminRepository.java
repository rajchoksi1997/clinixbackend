package com.shriram.clinix.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.shriram.clinix.constants.AdminSQLQueries;
import com.shriram.clinix.model.Admin;

@Repository
// returns the information of admin with specified id
public interface AdminRepository extends JpaRepository<Admin, Long> {

	@Query(value = AdminSQLQueries.GET_ADMIN, nativeQuery = true)
	Admin getAdmin(long id);

}
