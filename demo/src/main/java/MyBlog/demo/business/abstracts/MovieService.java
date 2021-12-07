package MyBlog.demo.business.abstracts;

import java.util.List;

import MyBlog.demo.entities.concretes.Movie;

public interface MovieService {
   
	List<Movie> getAll();
	Movie add(Movie movie);
}
