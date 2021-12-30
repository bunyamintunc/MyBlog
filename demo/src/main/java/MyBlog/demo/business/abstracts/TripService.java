package MyBlog.demo.business.abstracts;

import java.util.List;

import MyBlog.demo.entities.concretes.Trip;

public interface TripService {

	 List<Trip> getAll();
	 Trip Add(Trip trip);
	 String deleteTripById(int tripId);
}
