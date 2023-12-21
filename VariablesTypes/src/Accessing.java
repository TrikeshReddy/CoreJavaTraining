
public class Accessing {
	static int i=90;
	public static void main(String[] args) {
		int i=20;
		System.out.println(i);//20 or 90//20
		Accessing a1 =new Accessing();
		System.out.println(a1.i);//20 or 90//90
	}
}
