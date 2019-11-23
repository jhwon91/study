package chap04;

import java.util.Scanner;

public class Reservation_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Reservation re = new Reservation();
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		while(true) {			
			System.out.print("(1)예약  (2)조회  (3)취소  (4)종류 >> ");
			
			int menu =  sc.nextInt();
			if(menu == 4) break;
			
			switch(menu){
			case 1:		//예약
				re.Reserve();
				break;
			case 2:		//조회
				re.Check();
				break;
			case 3:		//취소
				re.Cancel();
				break;
			default:
				System.out.println("번호를 다시 입력해 주세요");
			}
		}
	}
}
