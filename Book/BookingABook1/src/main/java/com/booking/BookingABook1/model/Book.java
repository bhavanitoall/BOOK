package com.booking.BookingABook1.model;

 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {
	
	@Id
	
	private Integer id; 
	@Column
	private String name;
	@Column
	private String auther;
	@Column
	private Integer price;
	public Book(Integer id, String name, String auther, Integer price) {
		super();
		this.id = id;
		this.name = name;
		this.auther = auther;
		this.price = price;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Hotel [id=" + id + ", name=" + name + ", auther=" + auther + ", price=" + price + "]";
	}
	
}