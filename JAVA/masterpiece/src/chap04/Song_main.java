package chap04;

public class Song_main {
	public static void main(String[] args) {
		String array[] = {"ABBA","ABA"};
		Song s1 = new Song("Dancing Queen","ABBA","THE Albums",array,"2008","3") ;
		s1.show();
		System.out.println(array[0]);
	}
}
