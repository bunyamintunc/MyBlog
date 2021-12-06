package MyBlog.demo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import MyBlog.demo.entities.concretes.Trip;

public interface TripDao extends JpaRepository<Trip, Integer> {

}
