package MyBlog.demo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import MyBlog.demo.entities.concretes.Book;

public interface BookDao extends JpaRepository<Book, Integer>{
	
	
	
}