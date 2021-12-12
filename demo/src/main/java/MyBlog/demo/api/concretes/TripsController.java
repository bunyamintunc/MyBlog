package MyBlog.demo.api.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import MyBlog.demo.business.abstracts.TripService;
import MyBlog.demo.entities.concretes.Trip;

@RestController
@RequestMapping("/api/trips")
public class TripsController {
	
	private TripService tripService;
    
	@Autowired
	public TripsController(TripService tripService) {
		super();
		this.tripService = tripService;
	}
	
	@GetMapping("/getall")
	public List<Trip> getAll(){
		return this.tripService.getAll();
	}
	
	@PostMapping("/add")
	public Trip add(@RequestBody Trip trip) {
		return this.add(trip);
	}
	
	@DeleteMapping("/delete/{tripId}")
	public void deleteTripById(@PathVariable("tripId") int tripId) {
		this.tripService.deleteTripById(tripId);
	}
	
	
	

}
