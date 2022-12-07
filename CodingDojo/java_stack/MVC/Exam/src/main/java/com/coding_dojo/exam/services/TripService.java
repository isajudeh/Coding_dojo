package com.coding_dojo.exam.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.coding_dojo.exam.models.Trip;
import com.coding_dojo.exam.models.User;
import com.coding_dojo.exam.repositories.TripRepository;

@Service
public class TripService {
	private final TripRepository tripRepo;
	
	public TripService(TripRepository tripRepo) {
		this.tripRepo = tripRepo;
	}
	
	public List<Trip> allProjects(){
		return tripRepo.findAll();
	}
	
	public Trip updateProject(Trip trip) {
		return tripRepo.save(trip);
	}
	
	public List<Trip> getAssignedUsers(User user){
		return tripRepo.findAllByUsers(user);
	}
	
	public List<Trip> getUnassignedUsers(User user){
		return tripRepo.findByUsersNotContains(user);
	}
	
	public Trip addProject(Trip trip) {
		return tripRepo.save(trip);
	}
	
	public void deleteProject(Trip trip) {
		tripRepo.delete(trip);
	}
	
	public Trip findById(Long id) {
		Optional<Trip> optionalTrip = tripRepo.findById(id);
		if(optionalTrip.isPresent()) {
			return optionalTrip.get();
		}else {
			return null;
		}
	}
	
}