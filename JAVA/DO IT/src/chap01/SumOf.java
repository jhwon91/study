package chap01;

public class SumOf {
	static int sumof(int a, int b){
		//답지
		int max;
		int min;
		
		if(a>b)
		{
			max=a;
			min=b;
		}else{
			max=b;
			min=a;
		}
		
		int sum=0;
		for(int i=min;i<=max;i++){
			sum += i;
		}
		return sum;
		
		
		
		//내가한 소스코드
		/*int sum=0;
		if(a<b){
			for(int i=a;i<=b;i++){
				sum=sum+i;
			}
			return sum;
		}else {
			for(int i=a;i>=b;i--){
				sum=sum+i;
			}
			return sum;
		}*/
		
	}
	public static void main(String[] args) {
		System.out.println(sumof(3, 5));
		System.out.println(sumof(6, 4));

	}
}
