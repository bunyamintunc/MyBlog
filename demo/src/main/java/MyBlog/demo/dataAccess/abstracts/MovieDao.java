package MyBlog.demo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import MyBlog.demo.entities.concretes.Movie;

public interface MovieDao extends JpaRepository<Movie, Integer> {

}
