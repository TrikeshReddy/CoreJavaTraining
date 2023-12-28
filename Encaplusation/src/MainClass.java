
public class MainClass {
	public static void main(String[] args) {
		Encapsulate encapsulate = new Encapsulate();
		encapsulate.setI(0);
		System.out.println(encapsulate.getI());
		//this it represents current object
		encapsulate.setCh('F');
		System.out.println(encapsulate.getCh());
	}
}
