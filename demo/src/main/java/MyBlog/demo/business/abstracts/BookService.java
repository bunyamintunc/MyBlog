package MyBlog.demo.business.abstracts;

import java.util.List;
import java.util.Optional;

import MyBlog.demo.entities.concretes.Book;

public interface BookService {
	
  List<Book> getAll();
  Optional<Book> getByBookId(int id);
}
