
public class B extends A{
	
public static void main(String[] args) {
	
	 
	 
B b = new B();
b.m1();
System.out.println(b.random);
b.m2();
B.m2();
b.m4();
System.out.println(B.h);



//A a = new A();
//a.m4();
}
void m4() {
	System.out.println("m4 called");
}
}
