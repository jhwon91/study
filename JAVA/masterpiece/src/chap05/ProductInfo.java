package chap05;

import java.util.Scanner;

import chap04.Seat;

public class ProductInfo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product[] product_array = new Product[10];
		int count = 0;
		while(true) {
			System.out.print("(1)상품 추가  (2)모든 상품 조회  (3)끝내기  >> ");
			
			int menu = sc.nextInt();
			if(menu == 3) break;
			
			switch(menu) {
			case 1:
				System.out.print("(1)책  (2)음악CD  (3)회화책  >> ");
				int pro_menu = sc.nextInt();
				
				switch(pro_menu) {
				case 1:
					product_array[count] = new Book();
					break;
				case 2:
					product_array[count] = new CompactDisc();
					break;
				case 3:
					product_array[count] = new ConversationBook();
					break;
				}
				product_array[count].input();
				//System.out.println("id: "+product_array[count].getId());
				count++;
				//System.out.println(count);
				break;
			case 2:
				try {
					for(int i =0 ; i<product_array.length; i++) {
						product_array[i].show();
					}
				}catch(NullPointerException e) {
					System.out.println("");
				}
				
				
				break;
			default:
				System.out.println("다시 입력 해주세요");
			}
		}
	}
}
