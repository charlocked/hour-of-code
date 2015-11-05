package net.nhcs.first.main;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int first = scanner.nextInt();
		int second = scanner.nextInt();
		scanner.close();
		System.out.println(first + second);
	}

}
