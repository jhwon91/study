package chap02;

import java.util.Scanner;

public class Q2ReverseArray {
	
	static void swap(int[] a,int idx1,int idx2){
		System.out.println("a["+idx1+"]과(와) a["+idx2+"]를 교환합니다");
		int t = a[idx1];
		a[idx1]=a[idx2];
		a[idx2]=t;
		print(a);
		
	}
	
	
	static void reverse(int[] a){
		for(int i=0;i<a.length/2;i++){
			swap(a, i, a.length-i-1);
		}
		
		System.out.println("역순 정렬을 마쳤습니다.");
	}
	
	static void print(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
	
	
	static int sumOf(int[] a){
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum += a[i];
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = stdIn.nextInt();
		
		int[] x = new int[num];
		
		for(int i =0 ;i<num;i++){
			System.out.print("x["+i+"] : ");
			x[i] = stdIn.nextInt();
		}
		

		print(x);
		
		System.out.println("배열 모든요소의합계 : " + sumOf(x));
		//reverse(x);
		
		/*for(int i =0 ;i<num;i++){
			System.out.println("x["+i+"] : "+x[i]);
		}*/
	}
}
