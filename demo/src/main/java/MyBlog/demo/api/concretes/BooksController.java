package MyBlog.demo.api.concretes;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import MyBlog.demo.business.abstracts.BookService;
import MyBlog.demo.entities.concretes.Book;





@RestController
@RequestMapping("/api/books")
public class BooksController {
	
	private BookService bookService;
    
	@Autowired
	public BooksController(BookService bookService) {
		super();
		this.bookService = bookService;
	}
	//normalde benim backetim 8080 portunu kullanıyor.
	//8080 portunda herangi farklı bir porttan ulaşılabilmesini sağladım.
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/getall")
	public List<Book> getAll(){
		
		return this.bookService.getAll();
		
	}
	
	@GetMapping("/getbybookid")
	public Optional<Book> getByBookId(@RequestParam("categoryId") int  id) {
		return this.bookService.getByBookId(id);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/add")
	public Book add(@RequestBody Book book) {
		
		
		return this.bookService.Add(book);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id")  int id) {
		this.bookService.remove(id);
	}
	
	
	
	

}
