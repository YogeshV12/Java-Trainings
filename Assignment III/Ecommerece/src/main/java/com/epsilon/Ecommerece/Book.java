package com.epsilon.Ecommerece;

public class Book {
	   int bookId;

	   String BookName;

	   String language ;

	   Publisher publisher;

	   Author author;

	   double price;
	   
	   


	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return BookName;
	}

	public void setBookName(String bookName) {
		BookName = bookName;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", BookName=" + BookName + ", language=" + language + ", publisher="
				+ publisher + ", author=" + author + ", price=" + price + "]";
	}


}
