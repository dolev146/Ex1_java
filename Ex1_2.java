public class Ex1_2 {

	public static void main(String[] args) {

		// according to this video i will create the code
		// https://www.youtube.com/watch?v=HJ_PP5rqLg0

		// we will solve the problem using the Russian technique

		System.out.println("********************************");

		System.out.println("we will solve the problem using the Russian technique");

		int firstNumber = MyConsole.readInt("give me the first number for the Egyption multiplication : "); // example
																											// // 10
		int secondNumber = MyConsole.readInt("give me the second number for the Egyption multiplication : "); // for

		// variables for the ejyption multiplication
		int firstNumberEjy = firstNumber;
		int secondNumberEjy = secondNumber;

		System.out.println("the first number is : " + firstNumber);
		System.out.println("the second number is : " + secondNumber); // example : 30

		int sumOfTheOddNumbers = 0;

		while (firstNumber > 0) {

			// this is how why i check the odd numbers this way
			// https://stackoverflow.com/questions/7342237/check-whether-number-is-even-or-odd/51998794
			if ((firstNumber & 1) == 0) {
			} else {
				sumOfTheOddNumbers += secondNumber;
			}
			firstNumber /= 2;
			secondNumber *= 2;
		}
		System.out.println("the solve for the multiplication is  : " + sumOfTheOddNumbers);

	}

}
