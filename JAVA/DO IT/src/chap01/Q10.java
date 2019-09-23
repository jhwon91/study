package chap01;

import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("a의 값 : ");
		int a = stdIn.nextInt();
		int b=0;
		while (true) {
			System.out.print("b의 값：");
			b = stdIn.nextInt();
			if (b > a)
				break;
			System.out.println("a보다 큰 값을 입력하세요!");
		}
		
		//내가한거
		/*int a;
		int b;
		
		do{
			System.out.print("a의 값 : ");
			a = stdIn.nextInt();
			System.out.print("b의 값 : ");
			b = stdIn.nextInt();
			if(a>=b){
				System.out.print("a보다 큰 값을 입력하세요");
				System.out.print("b의 값 : ");
				b = stdIn.nextInt();
			}
		}while(a>=b);*/
		
		System.out.println("b-a는"+(b-a)+"입니다");
	}
}
