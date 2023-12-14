
public class Decrement {
	public static void main(String[] args) {
		int i=10;
		/*
		 * System.out.println(i--);// prints 10 and decreases the value of i =9
		 * System.out.println(i);//prints 9 System.out.println(--i);//first decreases
		 * the value of i =8 and prints 8
		 */
		//i=9 9 + 9 + 8 +8
		int a =--i + i-- + i + i++;
		System.out.println(i);
		System.out.println(a);
	}
}
