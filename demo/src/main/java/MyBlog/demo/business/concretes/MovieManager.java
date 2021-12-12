package MyBlog.demo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MyBlog.demo.business.abstracts.MovieService;
import MyBlog.demo.dataAccess.abstracts.MovieDao;
import MyBlog.demo.entities.concretes.Movie;
@Service
public class MovieManager implements MovieService{
     
	
    private MovieDao movieDao;
    
    @Autowired
	public MovieManager(MovieDao movieDao) {
		super();
		this.movieDao = movieDao;
	}

	@Override
	public List<Movie> getAll() {
		return this.movieDao.findAll();
	}

	@Override
	public Movie add(Movie movie) {
		return this.movieDao.save(movie);
	}

	@Override
	public String deleteMovieById(int movieId) {
		this.movieDao.deleteById(movieId);
		return movieId +" numaralı film silindi";
	}

}
