package chap05;

import java.util.Scanner;

public class Book extends Product{
	private int ISBN;
	private String author;
	private String book_title;
	
	public Book() {
		
	}
	
	public Book(String product_inform, String producer, int price, int iSBN, String author, String book_title) {
		super(product_inform, producer, price);
		ISBN = iSBN;
		this.author = author;
		this.book_title = book_title;
	}
	
	
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getBook_title() {
		return book_title;
	}
	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}

	@Override
	public void show() {
		super.show();
		System.out.println("ISBN >>"+getISBN());
		System.out.println("历磊 >>"+getAuthor());
		System.out.println("氓 力格>>"+getBook_title());
	}
	
	@Override
	public void input() {
		super.input();
		Scanner b_sc = new Scanner(System.in);
		System.out.println("ISBN >>");
		ISBN = b_sc.nextInt();
		System.out.println("历磊 >>");
		author = b_sc.next();
		System.out.println("氓 力格>>");
		book_title = b_sc.next();
	}
	
}
