
public class Ex1_1_3 {

	public static void main(String[] args) {

		int n = MyConsole.readInt("give the value for n :  ");
		int m = MyConsole.readInt("give me the gap  (m):  ");
		boolean userOutPut = false;

		// Create a boolean array "prime[0..n]"
		// and initialize all entries it as
		// true. A value in prime[i] will
		// finally be false if i is Not a
		// prime, else true.
		boolean prime[] = new boolean[n + 1];

		for (int i = 0; i <= n; i++) {
			prime[i] = true;
		}

		for (int p = 2; p * p <= n; p++) {

			// If prime[p] is not changed,
			// then it is a prime
			if (prime[p] == true) {

				// Update all multiples of p
				for (int i = p * 2; i <= n; i += p)
					prime[i] = false;
			}
		}

		// to check for twin prime numbers
		// display the twin prime
		for (int i = 2; i <= n - m; i++) {

			if (prime[i] == true && prime[i + m] == true) {

				// Display the result
				System.out.print(" (" + i + ", " + (i + m) + ")");
				userOutPut = true;
			}
		}
		if (!userOutPut) {
			System.out.println("we couldnt find a match for the values you gave us ....");
		}

	}

}
