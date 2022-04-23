package lect15;

import java.util.Arrays;

public class sieve_of_eratosthenis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SOE(3);
	}

	public static void SOE(int n) {
		boolean[] primes = new boolean[n + 1];
		Arrays.fill(primes, true);
		primes[0] = primes[1] = false;
		for (int table = 2; table * table <= n; table++) {
			if (primes[table] == true) {
				for (int mul = 2; mul * table <= n; mul++) {
					primes[mul * table] = false;
				}
			}
		}
		for (int i = 0; i < primes.length; i++) {
			if (primes[i]) {
				System.out.println(i);
			}
		}

	}

}
