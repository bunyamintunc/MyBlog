package MyBlog.demo.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;





@Entity
@Table(name="movies")
public class Movie {
	@Id
	@GeneratedValue()
	@Column(name="id")
	private int id;
	
	@Column(name="movie_name")
	private String movieName;
	
	@Column(name="description")
	private String description;
	
	@Column(name="movie_image")
	private String movieImage;
	
	@Column(name="watch_date")
	private String watchDate;
	
	public Movie() {
		
	}

	public Movie(int id, String movieName, String description, String movieImage, String watchDate) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.description = description;
		this.movieImage = movieImage;
		this.watchDate = watchDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMovieImage() {
		return movieImage;
	}

	public void setMovieImage(String movieImage) {
		this.movieImage = movieImage;
	}

	public String getWatchDate() {
		return watchDate;
	}

	public void setWatchDate(String watchDate) {
		this.watchDate = watchDate;
	}
	

}
