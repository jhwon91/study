package chap04;

import java.util.Scanner;

public class Player {
	private String name;  //참가자 이름
	private String word;
	
	public Player(String name) {
		this.name=name;
	}
	
	public void sayword() {  //사용자로 부터 단어를 입력 받는 메소드
		System.out.print(name + ">>");
		Scanner sc = new Scanner(System.in);
		this.word = sc.next();
	}
	
	public boolean succeed(String pre_word) {
		int lastIndex = pre_word.length()-1;
		char lastChar = pre_word.charAt(lastIndex);
		char firstChar = word.charAt(0);
		if(lastChar == firstChar)
			return true;
		return false;
	}
	
	public String getName() {
		return name;
	}
	
	public String getWord() {
		return word;
	}
	
}
