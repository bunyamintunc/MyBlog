package MyBlog.demo.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movies")
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="movie_name")
	private String movieName;
	@Column(name="description")
	private String description;
	@Column(name="movie_image")
	private String movieImage;
	@Column( name="watch_date")
	private Date watchDate;
	
	public Movie() {
		
	}
	
	public Movie(int id, String movieName, String description, String movieImage, Date watchDate) {
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

	public Date getWatchDate() {
		return watchDate;
	}

	public void setWatchDate(Date watchDate) {
		this.watchDate = watchDate;
	}
	
	

}
