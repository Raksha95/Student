package pckg_1;

public class ConstructorTwo {
	public ConstructorTwo() {
		this(12, 100, 14.5);
		System.out.println("This is a default constructor");
	}

	public ConstructorTwo(int a) {

		this(11, 45, 34.1, 50.2);
		System.out.println("This is One parameterized constructor");
	}

	public ConstructorTwo(int a, int b) {

		this();
		System.out.println("This is Two parameterized constructor");
	}

	public ConstructorTwo(int a, int b, double c) {
		System.out.println("This is Three parameterized constructor");
	}

	public ConstructorTwo(int a, int b, double c, double d) {
		this(4, 5);
		System.out.println("This is Four parameterized constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorTwo rak = new ConstructorTwo(66);
	}

}
