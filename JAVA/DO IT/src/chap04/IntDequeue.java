package chap04;

public class IntDequeue {
	private int max; // 덱(deck)의 용량
	private int num; // 현재의 데이터 수
	private int front; // 맨 앞 커서
	private int rear; // 맨 뒤 커서
	private int[] que; // 덱(deck)의 본체

	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {
		}
	}

	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {
		}
	}
	
	public IntDequeue(int capacity) {
		num=front=rear=0;
		max=capacity;
		try {
			que=new int[max];
		} catch (OutOfMemoryError e) {
			max=0;
		}
	}
	// 덱(deck)에 데이터를 머리쪽부터 인큐
	public int enqueFront(int x) throws OverflowIntQueueException{
		if(num>=max) {
			throw new OverflowIntQueueException();
		}
		que[--front]=x;
		num++;
		return 0;
	}

	// 덱(deck)에 데이터를 꼬리쪽부터 인큐
	public int enqueRear(int x) throws OverflowIntQueueException  {
		if(num>=max) {
			throw new OverflowIntQueueException();
		}
			que[rear++]=x;
			num++;
		return x;
	}

	// 덱(deck)의 머리부터 데이터를 디큐
	public int dequeFront() throws EmptyIntQueueException {
		if(0>=num) {
			throw new EmptyIntQueueException();
		}
		int x = que[front++];
		num--;
		return x;
	}

	// 덱(deck)의 꼬리부터 데이터를 디큐
	public int dequeRear() throws EmptyIntQueueException{
		if(0>=num) {
			throw new EmptyIntQueueException();
		}
		int x = que[--rear];
		num--;
		return x;
	}

	// 덱(deck)의 머리부터 데이터를 피크(머리데이터를 살펴봄)
	public int peekFront() {
		return 0;
	}

	// 덱(deck)의 꼬리부터 데이터를 피크(꼬리데이터를 살펴봄)
	public int peekRear() {
		return 0;
	}

}
