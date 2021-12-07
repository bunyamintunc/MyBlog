package MyBlog.demo.api.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import MyBlog.demo.business.abstracts.MovieService;
import MyBlog.demo.entities.concretes.Movie;

@RestController
@RequestMapping("/api/movies")
public class MoviesController {
	
	private MovieService movieService;
    
	@Autowired
	public MoviesController(MovieService movieService) {
		super();
		this.movieService = movieService;
	}
	
	@GetMapping("/getall")
	public List<Movie> getAll(){
		return this.movieService.getAll();
	}
	
	@PostMapping("/add")
	public Movie add(@RequestBody  Movie movie) {
		return this.movieService.add(movie);
	}
	
	

}
