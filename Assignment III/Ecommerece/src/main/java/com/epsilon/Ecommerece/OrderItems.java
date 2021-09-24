package com.epsilon.Ecommerece;

import java.util.List;

public class OrderItems {
	int orderId;

	List<Order> lo;

	public int getOrderId() {

	return orderId;

	}
	public void setOrderId(int orderId) {

	this.orderId = orderId;

	}

	public List<Order> getLo() {

	return lo;

	}

	public void setLo(List<Order> lo) {

	this.lo = lo;

	}

	@Override

	public String toString() {

	return "OrderItems [orderId=" + orderId + ", lo=" + lo + "]";

	}
}
