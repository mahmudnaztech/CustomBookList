package book.book;

public class Book {
	String bookName;
	int bookId;
	String author;
	
	public Book(String bookName, int bookId, String author) {
		super();
		this.bookName = bookName;
		this.bookId = bookId;
		this.author = author;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public boolean equals(Object obj) {
		Book book = (Book) obj;
		if(this.bookName == book.bookName && this.bookId==book.bookId && this.author==book.author) {
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return "bookName:" + bookName + ", bookId:" + bookId + ", author:" + author +"\n";
	}
}
