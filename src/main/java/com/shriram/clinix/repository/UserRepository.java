package com.shriram.clinix.repository;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.shriram.clinix.constants.UserSQLQueries;
import com.shriram.clinix.model.MedicareService;
import com.shriram.clinix.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	@Query(value = UserSQLQueries.FIND_BY_USERNAME, nativeQuery = true)
	Optional<User> findUserByUsername(String username);

	@Modifying
	@Transactional
	@Query(value = UserSQLQueries.ADD_NEW_USER, nativeQuery = true)
	Integer addUser(long id, String firstName, String lastName, long age, String gender, Date dob, long contact,
			long alt_contact, String email, String password, String sq, String sa);

	@Modifying
	@Transactional
	@Query(value = UserSQLQueries.ADD_NEW_ADMIN, nativeQuery = true)
	Integer addAdmin(long id, String firstName, String lastName, long age, String gender, Date dob, long contact,
			long alt_contact, String email, String password, String sq, String sa);

	@Modifying
	@Transactional
	@Query(value = UserSQLQueries.ADD_NEW_DOCTOR, nativeQuery = true)
	Integer addDoctor(long id, String firstName, String lastName, long age, String gender, Date dob, long contact,
			long alt_contact, String email, String password, String ad1, String ad2, String city, String state,
			long zip, String degree, String spe, String work, String hn, String sq, String sa, MedicareService ms,
			boolean approve);

	@Modifying
	@Transactional
	@Query(value = UserSQLQueries.ADD_NEW_PATIENT, nativeQuery = true)
	Integer addPatient(long id, String firstName, String lastName, long age, String gender, Date dob, long contact,
			long alt_contact, String email, String password, String ad1, String ad2, String city, String state,
			long zip, String sq, String sa, boolean approve);

	@Modifying
	@Transactional
	@Query(value = UserSQLQueries.ADD_USER_ROLE, nativeQuery = true)
	Integer addUserRole(long userId, long rollId);

	@Modifying
	@Transactional
	@Query(value = UserSQLQueries.ADD_NEW_AGENT, nativeQuery = true)
	Integer addAgent(long id, String fn, String ln, long age, String gender, Date dob, long cn, long acn,
			String emailid, String password, String ad1, String ad2, String city, String state, long zipcode, long c);

}
