package MyBlog.demo.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import MyBlog.demo.business.abstracts.TripService;
import MyBlog.demo.dataAccess.abstracts.TripDao;
import MyBlog.demo.entities.concretes.Trip;

@Service
public class TripManager implements TripService{

	private TripDao tripDao;
	
	public TripManager(TripDao tripDao) {
		super();
		this.tripDao = tripDao;
	}

	@Override
	public List<Trip> getAll() {
		return this.tripDao.findAll();
	}

	@Override
	public 	Trip Add(Trip trip) {
		
		return this.tripDao.save(trip);
		
	}

	@Override
	public String deleteTripById(int tripId) {
		this.tripDao.deleteById(tripId);
		return tripId +" numaralı gezi silindi";
	}

}
