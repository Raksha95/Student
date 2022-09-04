package pckg_1;

public class Constructor {

	public Constructor() {
		this(12, 100, 14.5);
		System.out.println("This is a default constructor");
	}

	public Constructor(int a) {

		this();
		System.out.println("This is One parameterized constructor");
	}

	public Constructor(int a, int b) {

		this(2);
		System.out.println("This is Two parameterized constructor");
	}

	public Constructor(int a, int b, double c) {
		System.out.println("This is Three parameterized constructor");
	}

	public Constructor(int a, int b, double c, double d) {
		this(4, 5);
		System.out.println("This is Four parameterized constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor qwerty = new Constructor(6, 7, 8.9, 10.1);

	}

}
