package MyBlog.demo.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="books")
@AllArgsConstructor
@NoArgsConstructor

public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="book_name")
	private String bookName;
	
	@Column(name="books_writer")
	private String bookWriter;
	
	@Column(name="count_paper")
	private int countPaper;
	
	@Column(name="categry_id")
	private int categoryId;
	
	@Column(name="books_image")
	private String bookImage;
	
	public Book(int id, String bookName, String bookWriter, int countPaper, int categoryId, String bookImage) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.bookWriter = bookWriter;
		this.countPaper = countPaper;
		this.categoryId = categoryId;
		this.bookImage = bookImage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookWriter() {
		return bookWriter;
	}

	public void setBookWriter(String bookWriter) {
		this.bookWriter = bookWriter;
	}

	public int getCountPaper() {
		return countPaper;
	}

	public void setCountPaper(int countPaper) {
		this.countPaper = countPaper;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getBookImage() {
		return bookImage;
	}

	public void setBookImage(String bookImage) {
		this.bookImage = bookImage;
	}
	public Book() {
		
	}

}
