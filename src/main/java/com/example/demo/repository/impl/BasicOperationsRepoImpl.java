package com.example.demo.repository.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.aggregate.FetchAddressAggregate;
import com.example.demo.common.CommonConstants;
import com.example.demo.repo.BasicOperationsRepo;
import com.example.demo.rowmapper.FetchAddressRowMapper;

@Repository
@PropertySource(value = {"classpath:query.properties"})
public class BasicOperationsRepoImpl implements BasicOperationsRepo {
	
	
	@Value("${get.name}")
	private String getName;
	
	@Value("${fetch.address}")
	private String fetchAddress;
	
	@Autowired
	private NamedParameterJdbcTemplate jdbc;

	@Override
	public String getTestData() {
		
		MapSqlParameterSource source = new MapSqlParameterSource();
		source.addValue(CommonConstants.ID,1);
		return jdbc.queryForObject(this.getName, source, String.class);
		
	}

	@Override
	public Optional<List<FetchAddressAggregate>> fetchAddress(int id) {
		MapSqlParameterSource source = new MapSqlParameterSource();
		source.addValue(CommonConstants.ID,id);
		List<FetchAddressAggregate> aggregateList = jdbc.query(this.fetchAddress, source,FetchAddressRowMapper.FETCH_ADDRESS_RM);
		if(aggregateList.isEmpty()) {
			return Optional.empty();
		} else  {
			return Optional.of(aggregateList);
		}
	}

}
