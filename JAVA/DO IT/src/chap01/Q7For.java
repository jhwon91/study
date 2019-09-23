package chap01;

import java.util.Scanner;

public class Q7For {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지 합을 구합니다");
		System.out.print("n의 값 : ");
		int n = stdIn.nextInt();
		
		int sum = 0;
		
		for(int i=1;i<=n;i++){
			sum += i;
			if(i==n){
				System.out.println(i+" = "+sum);
			}else
			System.out.print(i+" + ");
		}
		
		//System.out.println("1부터"+n+"까지의 합은"+sum+"입니다");

	}
}
