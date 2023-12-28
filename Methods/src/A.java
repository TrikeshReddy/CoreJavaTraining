
public class A {
	public static void main(String[] args) {
		Methods methods = new Methods();
		System.out.println("y:"+methods.y);
		A a=new A();
		System.out.println(a.sum('A', 10));
		
	}

	
	  int sum(char a,int b) { System.out.println("a :"+a);
	  System.out.println("b :"+b);
	  
	  return a+b; }
	 
	int sum(int a,int b) {
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		return a+b;
	}
}
