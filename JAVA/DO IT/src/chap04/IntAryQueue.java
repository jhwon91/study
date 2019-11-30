package chap04;

public class IntAryQueue {
	private int max;
	private int num;
	private int[] que;
	
	public IntAryQueue(int x) {
		num=0;
		max=x;
		que=new int[max];
	}
	
	public void enqueue(int x){
		que[num++]=x;
	}
	
	public void dequeue() {
		for(int i=0;i<num;i++) {
			que[i]=que[i+1];
		}
		num--;
	}
	
	public void print() {
		for(int i=0;i<num;i++) {
			System.out.print(que[i]+" ");
		}
		System.out.println();
	}
}
