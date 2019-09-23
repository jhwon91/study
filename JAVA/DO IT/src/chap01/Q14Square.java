package chap01;

import java.util.Scanner;

public class Q14Square {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("사각형을 출력 합니다");
		System.out.print("단수 : ");
		int n = stdIn.nextInt();
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
