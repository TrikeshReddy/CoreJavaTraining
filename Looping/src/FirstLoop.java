
public class FirstLoop {
	public static void main(String[] args) {
		int i=1;//initilising a value before loop execution starts
		/*
		 * System.out.println(i++);//1 System.out.println(i++);//2
		 * System.out.println(i++);//3 System.out.println(i++);//4
		 * System.out.println(i++);//1 System.out.println(i++);//2
		 * System.out.println(i++);//3 System.out.println(i++);//4
		 * System.out.println(i++);//1 System.out.println(i++);//2
		 * System.out.println(i++);//3 System.out.println(i++);//4
		 */		
		while(i<=5) {//having a condition which fails after loop execution
			//body of the loop
			System.out.println(i++);//which increases or decreases the value in the condition
			break;
		}
		System.out.println("out of the loop");
		//types of loops:3
		//while dowhile 
	}
}
