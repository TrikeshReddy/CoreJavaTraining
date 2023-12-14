
public class Arthemetic {
	public static void main(String[] args) {
		//addition is simple if you perform for same datatypes
		//int +  int==>int
		//addition would undergo one more step ie type conversion to larger datatype if 
		//there is a mismatch in datatypes
		int a;
		a=20;
		float b=30f;
		
		System.out.println(a + b);
		
		
		//char addition
		int c=20;
		char ch ='A';
		int d =c + ch;
		System.out.println(c+ch);
		
		//int with long
		int i=45;
		long l=567;
		long j=i+l;
		System.out.println(i+l);
		
		
		
		
		//char with byte
		byte e=12;
		char cr='A';//65
		//12 + 'A'
		//65 + 12
		char h= (char) (e +cr);
		System.out.println(e+cr);
		
	}
}
