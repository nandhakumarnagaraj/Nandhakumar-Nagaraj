package FirstScreening;

import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int a = sc.nextInt();
		int count = a % 2 == 0 ? a - 1 : a;
		int printed = 0, num = 1;

		while (printed < count) {
			System.out.print(num + " ");
			num += 2;
			printed++;
		}
	}
}
