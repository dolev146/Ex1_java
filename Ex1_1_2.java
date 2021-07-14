
public class Ex1_1_2 {

	public static void main(String[] args) {

		int number = MyConsole
				.readInt("give me a number and i will tell u all the twin prime numbers untill this number ");

		// Create a boolean array "prime[0..n]"
		// and initialize all entries it as
		// true. A value in prime[i] will
		// finally be false if i is Not a
		// prime, else true.
		boolean prime[] = new boolean[number + 1];

		for (int i = 0; i <= number; i++) {
			prime[i] = true;
		}
		for (int p = 2; p * p <= number; p++) {

			// If prime[p] is not changed,
			// then it is a prime
			if (prime[p] == true) {

				// Update all multiples of p
				for (int i = p * 2; i <= number; i += p)
					prime[i] = false;
			}
		}

		// to check for twin prime numbers
		// display the twin prime
		for (int i = 2; i <= number - 2; i++) {

			if (prime[i] == true && prime[i + 2] == true)

				// Display the result
				System.out.print(" (" + i + ", " + (i + 2) + ")");
		}

	}
}
