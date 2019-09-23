package chap01;

public class Q1Max4 {

	static int max4(int a, int b, int c, int d){
		int max = a;
		if(b>max)
			max=b;
		if(c>max)
			max=d;
		if(d>max)
			max=d;
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println("max4(3,7,4,9) = "+max4(3,7,4,9));
		System.out.println("max4(2,5,3,1) = "+max4(2,5,3,1));
		System.out.println("max4(2,5,9,8) = "+max4(2,5,9,8));
		System.out.println("max4(9,7,4,1) = "+max4(9,7,4,1));
		
	}
}
