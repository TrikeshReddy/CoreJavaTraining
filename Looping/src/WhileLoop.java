
public class WhileLoop {
	public static void main(String[] args) {

		int i = 1;
		// dowhile syntax:

		do {
			System.out.println(i++);
		
		} while (i <=10);

		i = 1;
		while (i > 1) {// having a condition which fails after loop execution
			// body of the loop
			System.out.println(i++);// which increases or decreases the value in the condition
		}
		System.out.println("out of the loop");

	}
}
