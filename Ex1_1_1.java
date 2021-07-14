
public class Ex1_1_1 {

	public static void main(String[] args) {

		int num = MyConsole.readInt("give me a number and i will tell u if it is prime or not : ");

		if (num <= 1) {
			System.out.println(false);
			;
		}
		boolean isPrime = false;
		for (int i = 2; i * i <= num; ++i) {
			// condition for non prime number
			if (num % i == 0) {
				isPrime = true;
				break;
			}
		}

		if (!isPrime)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + "  not a prime number.");
	}

}
