package chap05;

import java.util.Scanner;

public class CompactDisc extends Product {
	private String album;
	private String artist;
	
	public CompactDisc() {
		
	}
	
	public CompactDisc(String product_inform, String producer, int price, String album, String artist) {
		super(product_inform, producer, price);
		this.album = album;
		this.artist = artist;
	}
	
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	
	
	@Override
	public void show() {
		super.show();
		System.out.println("엘범 제목 >>"+getAlbum());
		System.out.println("가수 >>"+getArtist());
	}
	
	@Override
	public void input() {
		super.input();
		Scanner cd_sc = new Scanner(System.in);
		System.out.println("엘범 제목 >>");
		album = cd_sc.next();
		System.out.println("가수 이름>>");
		artist = cd_sc.next();
	}
}
