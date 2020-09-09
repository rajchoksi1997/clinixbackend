package com.shriram.clinix.constants;

public interface MedicareServiceSQLQueries {

	String FIND_MEDICARE_SERVICE = "SELECT " + "medicare_service_id," + "medicare_service,"
			+ "service_description," + "amount " + "FROM " + "medicare_services " + "WHERE "
			+ "medicare_service_id=?;";
}
