package assignmentLokeshOOPS;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeNum {
	ArrayList<Integer> a = new ArrayList<Integer>();

	void primef() {
		System.out.println(" enter number between 100 and 700");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n >= 100 && n <= 700) {
			System.out.print(n+" = ");

			for (int i = 2; i <= n; i++) {
				while (n % i == 0) {
					a.add(i);
					n = n / i;
				}
			}
			for (int i = 0; i < a.size() - 1; i++) {

				System.out.print(a.get(i) + " * ");
			}
			System.out.println(a.get(a.size() - 1));
		} else {
			throw new InputMismatchException();
		}

	}

	public static void main(String[] args) {
		while (true) {
			try {
				new PrimeNum().primef();
				break;
			} catch (InputMismatchException e) {

				System.out.println(" invalid number... ");

			}

		}
	}
}