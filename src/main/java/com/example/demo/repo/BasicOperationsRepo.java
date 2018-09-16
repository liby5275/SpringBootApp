package com.example.demo.repo;

import java.util.List;
import java.util.Optional;

import com.example.demo.aggregate.FetchAddressAggregate;

public interface BasicOperationsRepo {

	String getTestData();

	Optional<List<FetchAddressAggregate>> fetchAddress(int id);

}
