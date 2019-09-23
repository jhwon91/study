package chap01;

import java.util.Scanner;

public class Q11 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;		
		
		System.out.println("양의 자리 정수를 입력하세요");
		do{
			System.out.print("정수 값 : ");
			n = stdIn.nextInt();

		}while(n<=0);
		
		int no=0;
		while(n>0){
			n /= 10;
			no++;
		}
		
		System.out.println("그 수는"+no+"자리입니다.");
	}
}
