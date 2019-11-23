package chap04;

public class Rectangle {
	int x1;
	int x2;
	int y1;
	int y2;
	
	public Rectangle() {
		
	}
	
	public Rectangle(int x1, int x2, int y1, int y2) {
		this.x1=x1;
		this.x2=x2;
		this.y1=y1;
		this.y2=y2;
	}
	
	public void set(int x1, int x2, int y1, int y2) {
		this.x1=x1;
		this.x2=x2;
		this.y1=y1;
		this.y2=y2;
	}
	
	public int square() {
		int sq = Math.abs((x2-x1)*(y2-y1));
		return sq;
	}
	
	public void show() {
		System.out.println("x1 : " + x1);
		System.out.println("x2 : " + x2);
		System.out.println("y1 : " + y1);
		System.out.println("y1 : " + y1);
		System.out.println("≥–¿Ã : " + square());
	}
	
	public boolean equals(Rectangle r) {
		if(this.square() == r.square()) {
			return true;
		}else {
			return false;	
		} 
	}
}
