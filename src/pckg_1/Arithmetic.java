package pckg_1;

public class Arithmetic {

	public int sum(int a, int b) {

		int sumResult = a + b;
		return sumResult;

	}

	public int sub(int c, int d) {

		int subResult = c - d;
		return subResult;

	}

	public int multi(int e, int f) {

		int multiResult = e * f;
		return multiResult;

	}

	public int div(int g, int h) {

		int divResult = g / h;
		return divResult;

	}

	public static void main(String[] args) {

		Arithmetic arth = new Arithmetic();
		int sumResult = arth.sum(10, 2);
		int sumResult2 = arth.sum(sumResult, 2);
		int multiResult = arth.multi(sumResult2, 2);
		int subResult = arth.sub(multiResult, 2);
		int divResult = arth.div(subResult, 2);

		System.out.println("Assignment 1 output is:" + divResult);

		int one = arth.multi(10, 2);
		int two = arth.sub(one, 2);
		int three = arth.sum(two, 2);
		int four = arth.sub(three, 2);
		int five = arth.div(four, 2);

		System.out.println("Assignment 2 output is:" + five);

	}
}