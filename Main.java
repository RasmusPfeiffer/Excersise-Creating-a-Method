package Exercises;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Input obj = new Input();
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number between 50 and 300.\n>");
		String userInput = input.nextLine();
		int conInput = Integer.parseInt(userInput);

		
		System.out.println("The number you typed in was: " + obj.setInput(conInput));
	
		input.close();
	}
}