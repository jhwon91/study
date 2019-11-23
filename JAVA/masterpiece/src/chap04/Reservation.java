package chap04;

import java.util.Scanner;

public class Reservation {
	Scanner sc =new Scanner(System.in);
	private Seat s[];
	private String seatGrade[]= {"S","A","B"};
	
	public Reservation() {
		s=new Seat[3];
		for(int i=0;i<s.length;i++) {
			s[i]=new Seat();
		}
	}
	
	public void Reserve() {		//예약
		System.out.println("좌석 구분  S(1), A(2), B(3) >> ");
		int Reserve_menu = sc.nextInt();
		
		System.out.print(seatGrade[Reserve_menu-1]+">>");
		s[Reserve_menu-1].show();
		System.out.println();
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("번호 : ");
		int seat_num = sc.nextInt();
		
		s[Reserve_menu-1].set(name, seat_num);
		//s[Reserve_menu-1].show();
	}
	
	public void Check() {		//조회
		for(int i =0 ; i<s.length;i++) {
			System.out.print(seatGrade[i]+">>");
			s[i].show();
			System.out.println();
		}
		System.out.println("<<<조회를 완료하였습니다.>>>");
	}
	
	public void Cancel() {		//취소
		System.out.println("좌석 구분  S(1), A(2), B(3) >> ");
		int Cancel_menu = sc.nextInt();
		
		System.out.print(seatGrade[Cancel_menu-1]+">>");
		s[Cancel_menu-1].show();
		System.out.println();
		
		System.out.print("이름 : ");
		String C_name = sc.next();
		
		s[Cancel_menu-1].delete(C_name);
		System.out.println("<<<취소를 완료하였습니다.>>>");
		
	}
}
