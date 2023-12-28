
public class MethodOverriding {
//method overiding considered as run time polymorphism
	public static void main(String[] args) {
		B b = new B();
		b.m1();
		A a = new A();
		a.m1();
	}
}
