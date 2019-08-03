package conditionalstatement;

public class nestedif {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 30;

		if (a > b) {
			if (a < c) {
				System.out.println("a is greater");
			} else {
				System.out.println("a is hreaterthan b but less than c");
			}

		} else {
			System.out.println("a is less tha b");
		}
	}

}
