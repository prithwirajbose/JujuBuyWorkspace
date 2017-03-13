package com.jujubuy.bean;

import java.util.ArrayList;
import java.util.List;

public class CartBean {

	private long id;
	private long userId;
	private List<OrderItemBean> orderItems = new ArrayList<OrderItemBean>();
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public List<OrderItemBean> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(List<OrderItemBean> orderItems) {
		this.orderItems = orderItems;
	}

}
