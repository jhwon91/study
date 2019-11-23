package chap04;

import java.util.Scanner;

public class WordGame {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String pre_word = "아버지";
		
		
		System.out.print("게임에 참가하는 인원은  몇명입니까 : ");
		int num = stdIn.nextInt();

		Player[] player = new Player[num];

		for (int i = 0; i < player.length; i++) {
			System.out.println("참가자의 이름을 입력하세요");
			String name = stdIn.next();
			player[i] = new Player(name);
		}

		/*
		 * for(int i = 0; i<player.length ; i++) {
		 * System.out.println(player[i].getName()); }
		 */
		
		System.out.println("시작하는 단어는 아버지 입니다.");
		
		for(int i=0;;i++) 
		{
			player[i].sayword();
			if(!player[i].succeed(pre_word)) 
			{
				System.out.println(player[i].getName() + "이 졌습니다");
				break;
			}
			pre_word=player[i].getWord();
			if(i == num-1) 
			{
				i=-1;
			}
		}
		
	}
}
