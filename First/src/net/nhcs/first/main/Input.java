package net.nhcs.first.main;

import java.util.Scanner;

public class Input {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("what is your name? ");
		String name = scanner.nextLine();
		System.out.println("hello "+name);
	}

}
