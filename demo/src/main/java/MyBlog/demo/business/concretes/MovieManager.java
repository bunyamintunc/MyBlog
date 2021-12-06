package MyBlog.demo.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import MyBlog.demo.business.abstracts.MovieService;
import MyBlog.demo.dataAccess.abstracts.MovieDao;
import MyBlog.demo.entities.concretes.Movie;

@Service
public class MovieManager implements MovieService {
    
	private MovieDao movieDao;
	public MovieManager(MovieDao movieDao) {
		super();
		this.movieDao = movieDao;
	}
	@Override
	public List<Movie> getAll() {
		
		return this.movieDao.findAll();
		
	}

}
