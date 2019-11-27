package chap04;

public class Gstack<E> {
	private int max; // 스택 용량
	private int ptr; // 스택 포인터
	private E[] stk; // 스택 본체

	public Gstack(int capacity) {
		ptr = 0;
		max = capacity;

		if (max == 0) {
			System.out.println("생성할수 없습니다");
		} else {
			stk = (E[]) new Object[max];
		}
	}

	public void push(E x) {
		if (ptr == max) {
			System.out.println("스택이 가득 찼습니다.");
		} else {
			stk[ptr++] = x;
		}
	}

	public E pop() {
		if (ptr <= 0) {
			return null;
		} else {
			return stk[--ptr];
		}
	}

	public void dump() {
		for (int i = 0; i < ptr; i++) {
			System.out.print(stk[i] + " ");
		}
	}
}
