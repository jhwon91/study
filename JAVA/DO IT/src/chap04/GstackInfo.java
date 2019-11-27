package chap04;

public class GstackInfo {
	public static void main(String[] args) {
		Gstack<String> gs = new Gstack<String>(5);
		
		gs.push("a");
		gs.push("b");
		gs.push("c");
		gs.push("d");
		gs.pop();
		
		gs.dump();
	}
}
