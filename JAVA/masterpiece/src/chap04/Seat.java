package chap04;

public class Seat {
	private String seat[];
	
	public Seat() {
		seat = new String[10];
		for(int i =0; i<seat.length;i++) {
			seat[i]="---";
		}
	}
	
	public void show() {
		for(int i =0; i<seat.length;i++) {
			System.out.print(seat[i]+" ");
		}
	}
	
	public void set(String name, int num) {
		seat[num-1]=name;
	}
	
	public void delete(String name) {
		for(int i = 0; i<seat.length; i++) {
			if(name.equals(seat[i])) {
				seat[i]="---";
				break;
			}
		}
	}
}
