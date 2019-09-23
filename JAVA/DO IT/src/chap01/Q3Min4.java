package chap01;

public class Q3Min4 {
	static int min4(int a, int b, int c,int d){
		int min =a;
		if(b<min)
			min=b;
		if(c<min)
			min=c;
		if(d<min)
			min=d;
		return min;
	}
	public static void main(String[] args) {
		System.out.println("min4(3,7,4,9) = "+min4(3,7,4,9));
		System.out.println("min4(2,5,3,1) = "+min4(2,5,3,1));
		System.out.println("min4(2,5,9,8) = "+min4(2,5,9,8));
		System.out.println("min4(9,7,4,1) = "+min4(9,7,4,1));
		
	}
}
