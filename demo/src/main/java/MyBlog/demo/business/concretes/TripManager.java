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

}
