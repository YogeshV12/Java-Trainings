package com.epsilon.Ecommerece;

import java.util.List;

public class Order {
	int orderId;

	int UserId;

	List<Book> book;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", UserId=" + UserId + ", book=" + book + "]";
	}
	
	

}
