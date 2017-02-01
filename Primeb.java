package assignmentLokeshOOPS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.InputMismatchException;

import java.util.Scanner;

public class Primeb {

	static ArrayList<Integer> a = new ArrayList<Integer>();

	void primefb() {

		System.out.println(" enter number between 100 and 700");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n >= 100 && n <= 700) {
			System.out.print(n + " = ");

			for (int i = 2; i <= n; i++) {
				while (n % i == 0) {
					a.add(i);
					n = n / i;
				}
			}
			HashSet<Integer> h = new HashSet<Integer>(a);
			ArrayList<Integer> b = new ArrayList<Integer>(h);

			System.out.print(b.get(0) + " ^ " + Collections.frequency(a, b.get(0)));
			for (int i = 1; i < b.size(); i++) {

				System.out.print("*" + b.get(i) + " ^ " + Collections.frequency(a, b.get(i)));

			}

		}

		else {
			throw new InputMismatchException();
		}
	}

	public static void main(String[] args) {
		while (true) {
			try {
				new Primeb().primefb();
				break;
			} catch (InputMismatchException e) {

				System.out.println(" invalid number... please enter number between 100 and 700");

			}

		}

	}

}
