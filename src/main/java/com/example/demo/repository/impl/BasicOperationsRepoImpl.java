package com.example.demo.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.common.CommonConstants;
import com.example.demo.repo.BasicOperationsRepo;

@Repository
@PropertySource(value = {"classpath:query.properties"})
public class BasicOperationsRepoImpl implements BasicOperationsRepo {
	
	
	@Value("${get.name}")
	private String getName;
	
	@Autowired
	private NamedParameterJdbcTemplate jdbc;

	@Override
	public String getTestData() {
		
		MapSqlParameterSource source = new MapSqlParameterSource();
		source.addValue(CommonConstants.ID,1);
		return jdbc.queryForObject(this.getName, source, String.class);
		
	}

}
