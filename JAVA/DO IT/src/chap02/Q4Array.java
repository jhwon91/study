package chap02;

import java.util.Random;
import java.util.Scanner;

public class Q4Array {
	
	public static void print(int a[]){
		for(int i =0 ;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	static void copy(int[] a,int[]b){
		a=b.clone();
		print(a);
	}
	static void rcopy(int[]a, int[] b){
		a=b.clone();
		
		for(int i=0;i<a.length/2;i++){
			int t = a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1]=t;
			//swap(a,a[i],a[a.length-i-1]);
		}
		print(a);
	}
	/*static void swap(int[] a,int idx1, int idx2){
		
		int t=a[idx1];
		a[idx1]=a[idx2];
		a[idx2]=t;
	}*/
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("¿ä¼Ú¼ö´Â : ");
		int num = stdIn.nextInt();
		int[] na =new int[num];
		int[] nb =new int[num];
		
		for(int i=0;i<num;i++){
			nb[i]=rand.nextInt(10);
		}
		
		print(nb);
		System.out.println("Q4");
		copy(na,nb);
		System.out.println("Q5");
		rcopy(na,nb);
		
	}
}
