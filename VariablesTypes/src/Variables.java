
public class Variables {
	int k=20;//instance variable
	
	static int l=90;//static variable
	public static void main(String[] args) {
		int i=10;//local variable
		System.out.println(i);
		System.out.println(l);
		//new keyword creating an object with this u can access both static and non static methods and variables
		//loading of non static method will happen during the object creation
		Variables v1 = new Variables();
		//accesing a instance variable referncevariable.variablename
		System.out.println(v1.k);
		//accessing a non static method referncevariable.MethodName()
		v1.m1();
		v1.m2();
		System.out.println(Variables.l);
		System.out.println(v1.l);
		//System.out.println(j);
		
	}
	void m1() {
		int j=20;
		System.out.println(j);
		System.out.println(l);
		System.out.println(k);
	}
	static void m2() {
		int l=30;
		System.out.println(l);
		System.out.println(l);
	}
}
