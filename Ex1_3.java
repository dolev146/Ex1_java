
public class Ex1_3 {

	public static void main(String[] args) {

		// according to this website
		// https://he.wikipedia.org/wiki/%D7%9E%D7%A9%D7%95%D7%95%D7%90%D7%94_%D7%9E%D7%9E%D7%A2%D7%9C%D7%94_%D7%A9%D7%A0%D7%99%D7%99%D7%94

		// for this equation ax^2 + bx + c
		System.out.println("for this equation ax^2 + bx + c ");
		double a = MyConsole.readDouble("give me the value for a : ");
		double b = MyConsole.readDouble("give me the value for b : ");
		double c = MyConsole.readDouble("give me the value for c : ");

		if (a == 0 && b == 0 && c == 0) {

			System.out.println("all x are solutions  ");
		} else {

			if (a == 0 && b == 0 && c != 0) {
				System.out.println("no solutions ");
			}

			else {

				// first we will look for the value b^2 - 4 * a * c

				double insideTheSquereRoot = Math.sqrt((b * b) - (4 * a * c));

				// System.out.println(insideTheSquereRoot);

				if (Double.isNaN(insideTheSquereRoot)) {

					System.out.println("the parabola does not intersect the x-axis ");
				} else if (insideTheSquereRoot == 0) {

					double solution = (-b) / (2 * a);
					System.out.println("the parabola has one solution:  " + solution);
				} else {

					double solution1 = ((-b) + insideTheSquereRoot) / (2 * a);
					double solution2 = ((-b) - insideTheSquereRoot) / (2 * a);
					System.out.println("the parabola has 2 solutions:   ");
					System.out.println("x = " + solution1);
					System.out.println("x = " + solution2);
				}
			}
		}
	}

}
