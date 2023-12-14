
public class IncrementDecrement {
	public static void main(String[] args) {
		int i=10;
		/*//increment the value by 1
		//pre increment 
		System.out.println(++i);//11		
		System.out.println(i);//11	
		//post increment 
		System.out.println(i++);//11
		System.out.println(i);//12
*/		
		int a = ++i + i++ +i + i++;//11 + 11 + 12 +12 //13
		System.out.println(a);
		
		
	}
}
