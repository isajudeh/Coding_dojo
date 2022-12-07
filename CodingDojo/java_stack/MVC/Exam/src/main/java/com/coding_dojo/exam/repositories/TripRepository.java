package com.coding_dojo.exam.repositories;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coding_dojo.exam.models.Trip;
import com.coding_dojo.exam.models.User;

@Repository
public interface TripRepository extends CrudRepository<Trip, Long> {
	List<Trip> findAll();
	Trip findByIdIs(Long id);
	List<Trip> findAllByUsers(User user);
	List<Trip> findByUsersNotContains(User user);
}