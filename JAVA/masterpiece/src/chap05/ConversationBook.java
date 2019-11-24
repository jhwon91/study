package chap05;

import java.util.Scanner;

public class ConversationBook extends Book {
	private String language;
	
	public ConversationBook() {
		
	}
	
	public ConversationBook(String product_inform, String producer, int price, int iSBN, String author,
			String book_title, String language) {
		super(product_inform, producer, price, iSBN, author, book_title);
		this.language = language;
	}


	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public void show() {
		super.show();
		System.out.println("¾ð¾î >>"+getLanguage());
	}
	
	@Override
	public void input() {
		super.input();
		Scanner cb_sc = new Scanner(System.in);
		System.out.println("language >>");
		language = cb_sc.next();
	}
}
