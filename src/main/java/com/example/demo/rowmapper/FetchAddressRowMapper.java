package com.example.demo.rowmapper;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.aggregate.FetchAddressAggregate;
import com.example.demo.database.DataBaseConstants;

public class FetchAddressRowMapper {
	
	
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
