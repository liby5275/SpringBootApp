package com.example.demo.rowmapper;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.aggregate.FetchAddressAggregate;
import com.example.demo.database.DataBaseConstants;

public class FetchAddressRowMapper {


	/*
	 * @Override public FetchAddressAggregate mapRow(ResultSet rs, int rowNum)
	 * throws SQLException { FetchAddressAggregate aggregate = new
	 * FetchAddressAggregate(); aggregate.setId(rs.getInt(DataBaseConstants.ID));
	 * aggregate.setAddress1(rs.getString(DataBaseConstants.ADDRESS_1));
	 * aggregate.setAddress2(rs.getString(DataBaseConstants.ADDRESS_2));
	 * aggregate.setName(rs.getString(DataBaseConstants.NAME));
	 * aggregate.setAccountId(rs.getString(DataBaseConstants.ACCOUNT_ID)); return
	 * aggregate; }
	 */

	/*
	 * The below segment of code is written with lambda expression(->). This is
	 * specific to Java 8. In older version, we can achieve the same result by
	 * implementing the class with RowMapper<FetchAddressAggregate>, and then
	 * writing the above commented code. In that case the call from the repo would be
	 * like FetchAddressRowMapper.class instead of
	 * FetchAddressRowMapper.FETCH_ADDRESS_RM
	 * 
	 */

	
	
	public static final RowMapper<FetchAddressAggregate> FETCH_ADDRESS_RM = (rs, count) -> {
		
		FetchAddressAggregate aggregate = new FetchAddressAggregate();
		aggregate.setId(rs.getInt(DataBaseConstants.ID));
		aggregate.setAddress1(rs.getString(DataBaseConstants.ADDRESS_1));
		aggregate.setAddress2(rs.getString(DataBaseConstants.ADDRESS_2));
		aggregate.setName(rs.getString(DataBaseConstants.NAME));
		aggregate.setAccountId(rs.getString(DataBaseConstants.ACCOUNT_ID));
		return aggregate;

	};

}
	

