package com.example.been;

public class Cou {
	private int id;
	private String name;
	private String author;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Cou [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	public Cou(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	public Cou() {
		super();
		// TODO Auto-generated constructor stub
	}

}
