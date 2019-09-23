package chap01;

public class Q2Min3 {
	static int min3(int a, int b, int c){
		int min =a;
		if(b<min)
			min=b;
		if(c<min)
			min=c;
		return min;
	}
	
	public static void main(String[] args) {
		System.out.println("min3(7,4,9) = "+min3(7,4,9));
		System.out.println("min3(2,5,3) = "+min3(2,5,3));
		System.out.println("min3(5,9,8) = "+min3(5,9,8));
		System.out.println("min3(9,7,1) = "+min3(9,7,1));
	}
}
