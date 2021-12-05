package MyBlog.demo.business.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MyBlog.demo.business.abstracts.BookService;
import MyBlog.demo.dataAccess.abstracts.BookDao;
import MyBlog.demo.entities.concretes.Book;


@Service
public class BookManager implements BookService {
     
	
	private BookDao bookDao;
	
	@Autowired
	public BookManager(BookDao bookDao) {
		super();
		this.bookDao = bookDao;
	}


	@Override
	public List<Book> getAll() {
		
		return  this.bookDao.findAll();
		
	}


	@Override
	public Optional<Book> getByBookId(int id) {
		
		return this.bookDao.findById(id);
	}


	@Override
	public Book Add(Book book) {
		
		return this.bookDao.save(book);
		
		
	}

}
