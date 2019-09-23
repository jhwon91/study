package chap01;

import java.util.Scanner;

public class TriangleLB {
	
	
	static void triangleLB(int n){ //왼쪽 아래가 직각인 이등변 삼각형
		
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
		
		for(int i = 1; i<=n ; i++){
			for(int j =1 ;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	//내가한거
	/*static void triangleLU(int n){ //왼쪽 위가 직각인 이등변 삼각형
		
		System.out.println("왼쪽 위가 직각인 이등변 삼각형을 출력합니다.");
		
		for(int i = 1; i<=n ; i++){
			for(int j = n ;j>=i;j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}*/
	
	//답지 왼쪽 위가 직각인 이등변 삼각형
	static void triangleLU(int n) {
		
		System.out.println("왼쪽 위가 직각인 이등변 삼각형을 출력합니다.");
		for (int i = 1; i <= n; i++) { 				// i행 (i = 1, 2, … ,n)
			for (int j = 1; j <= n - i + 1; j++) 	// n-i+1개의 '*'를 나타냄
				System.out.print('*');
			System.out.println(); 					// 개행(줄변환)
		}
	}
	
	//내가한거
	/*static void triangleRB(int n){ //오른쪽 아래가 직각인 이등변 삼각형
		
		System.out.println("오른쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
		
		for(int i = 1; i<=n ; i++){
			for(int j = 1 ;j<=n;j++){
				if(n-j >= i)
				System.out.print(" ");
				else
				System.out.print("*");
			}
			System.out.println();
		}	
	}*/
	
	//답지 오른쪽 아래가 직각인 이등변삼각형을 출력
	static void triangleRB(int n) {
		System.out.println("오른쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
		for (int i = 1; i <= n; i++) { 				// i행 (i = 1, 2, … ,ln)
			for (int j = 1; j <= n - i; j++) 		// n-i개의 ' '를 나타냄
				System.out.print(' ');
			for (int j = 1; j <= i; j++) 			// i개의 '*'를 나타냄
				System.out.print('*');
			System.out.println(); 					// 개행(줄변환)
		}
	}
	
	static void triangleRU(int n){ //오른쪽 위가 직각인 이등변 삼각형
		
		System.out.println("오른쪽 위가 직각인 이등변 삼각형을 출력합니다.");
		
		for(int i = 1; i<=n ; i++){
			for(int j=1;j<=i-1;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=n-i+1;j++){
				System.out.print("*");
			}
			System.out.println();
		}

	}
	
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		do{
			System.out.print("몇 단 삼각형입니까? : ");
			n = stdIn.nextInt();
		}while(n<=0);
		
		triangleLB(n);
		triangleLU(n);
		triangleRB(n);
		triangleRU(n);
	}
}
