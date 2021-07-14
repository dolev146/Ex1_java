import java.awt.Color;

public class Ex1_5 {

	public static void main(String[] args) {

		// ax^2 + b*x + c

		System.out.println("for this equation ax^2 + bx + c ");
		double firstCoefficient = MyConsole.readDouble("give me the value for firstCoefficient : (for example : 1) ");
		double secondCoefficient = MyConsole.readDouble("give me the value for secondCoefficient : (for example : 2) ");
		double thirdCoefficient = MyConsole.readDouble("give me the value for thirdCoefficient : (for example : -3) ");

		double range = MyConsole.readDouble("give me the scale :  ( recommendad 10 ) ");
		double radius = MyConsole.readDouble("give me the radius of the pen size : for example (0.001) ");
		double accuracy = MyConsole.readDouble(
				"give me the accuracy : for exampe (  0.1 the smallar the number the accurate it will be , but it will take longer to draw ) ");

		//////// vertical lines
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.setPenRadius(0.001);
		// drawing the x and y axis
		StdDraw.line(0, 0.5, 1, 0.5);
		StdDraw.line(0.5, 1, 0.5, 0);
		StdDraw.setScale(-range, range);
		StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.setPenRadius(radius);
		for (double i = -range; i < range; i = i + accuracy) {
			double fx = firstCoefficient * i * i + secondCoefficient * i + thirdCoefficient;
			double fx2 = firstCoefficient * (i + 1) * (i + 1) + secondCoefficient * (i + 1) + thirdCoefficient;
			StdDraw.line(i, fx, i + 1, fx2);
		}

		// draw the origin
		StdDraw.setPenColor(Color.BLACK);

		StdDraw.text(-1, 1, "(" + 0 + ", " + 0 + ")");
		StdDraw.setPenRadius(0.01);
		StdDraw.point(0, 0);

		System.out.println();
		System.out.println();

		// the function y = ax^2 + b*x + c
		// the x axis solutions are divided to 3 if else

		double insideTheSquereRoot = Math
				.sqrt((secondCoefficient * secondCoefficient) - (4 * firstCoefficient * thirdCoefficient));

		System.out.println("the solution of the inside the squere root is = " + insideTheSquereRoot);

		if (Double.isNaN(insideTheSquereRoot)) {
			System.out.println("the parabola does not intersect the x-axis ");
		} else if (insideTheSquereRoot == 0) {
			double solution = (-secondCoefficient) / (2 * firstCoefficient);

			// draw intersection points
			StdDraw.setPenColor(Color.RED);
			StdDraw.setPenRadius(0.001);
			StdDraw.point(solution, 0);
			StdDraw.text(solution, -1, "(" + solution + ", " + 0 + ")");

		} else {
			double solution1 = ((-secondCoefficient) + insideTheSquereRoot) / (2 * firstCoefficient);
			double solution2 = ((-secondCoefficient) - insideTheSquereRoot) / (2 * firstCoefficient);
			System.out.println("the parabola has 2 solutions:   ");
			System.out.println("x = " + solution1);
			System.out.println("x = " + solution2);

			// draw intersection points
			StdDraw.setPenColor(Color.RED);
			StdDraw.setPenRadius(0.001);
			StdDraw.point(solution1, 0);
			StdDraw.point(solution2, 0);

			StdDraw.setPenColor(Color.BLACK);
			StdDraw.text(solution1, -1, "(" + solution1 + ", " + 0 + ")");
			StdDraw.text(solution2, 1, "(" + solution2 + ", " + 0 + ")");

		}

		// drawing the y axis dot
		if (thirdCoefficient != 0) {

			StdDraw.setPenColor(Color.RED);
			StdDraw.setPenRadius(0.01);
			StdDraw.point(0, thirdCoefficient);
			StdDraw.setPenColor(Color.BLACK);
			StdDraw.text(1, thirdCoefficient, "(" + thirdCoefficient + ", " + 0 + ")");

		}

	}

}
