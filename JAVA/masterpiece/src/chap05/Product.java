package chap05;

import java.util.Scanner;

public class Product {
	private int id;
	private String product_inform;
	private String producer;
	private int price;
	
	public Product() {
	
	}
	
	public Product(String product_inform, String producer, int price) {
		this.id=0;
		this.product_inform = product_inform;
		this.producer = producer;
		this.price = price;
		this.id++;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProduct_inform() {
		return product_inform;
	}
	public void setProduct_inform(String product_inform) {
		this.product_inform = product_inform;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void show() {
		System.out.println("상품 ID >>"+getId());
		System.out.println("상품 설명 >>"+getProduct_inform());
		System.out.println("생산자 >>"+getProducer());
		System.out.println("가격 >>"+getPrice());
	}
	
	public void input() {
		Scanner p_sc = new Scanner(System.in);
		System.out.println("상품 설명 >>");
		product_inform = p_sc.next();
		System.out.println("생산자 >>");
		producer = p_sc.next();
		System.out.println("가격 >>");
		price = p_sc.nextInt();
	}
	
	
}
