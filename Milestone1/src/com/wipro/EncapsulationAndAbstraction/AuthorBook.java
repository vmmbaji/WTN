package com.wipro.EncapsulationAndAbstraction;
class Author{
	private String name;
	private String email;
	private char g;
	public Author(String name,String email,char g){
		super();
		this.name=name;
		this.email=email;
		this.g=g;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String getEmail() {
		return email;
	}
	public void setg(char g) {
		this.g=g;
	}
	public char getG() {
		return g;
	}
	public String toString() {
		return "Author [name=" + name + ", email=" + email + ", gender=" + g + "]";
	}
}
class Book{
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;
	public Book(String name,Author author,double price,int qtyInStock){
		super();
		this.name=name;
		this.author=author;
		this.price=price;
		this.qtyInStock=qtyInStock;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setAuther(Author auther) {
		author=auther;
	}
	public Author getAuther() {
		return author;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public double getPrice() {
		return price;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock=qtyInStock;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", price=" + price + ", qtyInStock=" + qtyInStock + "]";
	}
}
public class AuthorBook {
	public static void main(String[] args) {
		Author a=new Author("sachin","sachin@gmail.com",'M');
		Book b=new Book("Java Programming",a,500.49,30);
		System.out.println(b.toString());
//		Book b=new Book();
//		b.setName("java Programming");
//		b.setPrice(500.49);
//		b.setQtyInStock(30);
//		b.getName();
//		b.getPrice();
//		b.getQtyInStock();
//		b.Bookdetails();
//		a.Autherdetails();
	}
}
