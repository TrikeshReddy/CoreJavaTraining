
public class MainMethod {

	public static void main(String[] args) {
		int a;
		//-2147483648 to 2147483647
		a=1234;
		System.out.println(a);//1234
		System.out.println("a");//a
		//TYpe conversion
		//MAnual conversion narrowing
		//automatic type conversion widening
		
		/*
		 * Widening Casting (automatically) - converting a smaller type to a larger type
		 * size byte -> short -> char -> int -> long -> float -> double
		 * Largerdatatype variableName= samllersizeVariable 
		 * int i =by;
		 * Narrowing Casting (manually) - converting a larger type to a smaller size
		 * type double -> float -> long -> int -> char -> short -> byte
		 * 
		 * smallerdatatype variablename=(smallerdatatype)largervariable;
		 */
		byte by = 127;
		int i =by;
		byte bi = (byte)i;
		
		System.out.println(i);
		System.out.println(bi);
		
		
		
	}

}
