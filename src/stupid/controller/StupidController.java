package stupid.controller;

//import java.util.Scanner;

/**
 * @author Dustin Schimel
 */

public class StupidController
{
	/*
	public void start()
	{
		System.out.println("I like dogs");
		
		testScanner();
		
	}
	
	private void testScanner()
	{
		Scanner firstScanner;
		firstScanner = new Scanner(System.in);
		System.out.println("What is your favorite food?");
		String answer = firstScanner.nextLine();
		System.out.println("Oh cool, you like " + answer);
	}
	*/
	
	private String[] words;// = { "One", "Two", "Three" };
	
	private int[] numbers;
	
	public StupidController()
	{
		words = new String[5];
		numbers = new int[10];
	}
	
	
	public void start()
	{
		System.out.println(words);
		System.out.println(numbers);
		
		words[0] = "My name";
		words[1] = "is Slim";
		words[2] = "Shady";
		words[4] = "Eminem";
		words[3] = "by";
		
		System.out.println(words[0]);
		
		for (String current : words)
		{
			System.out.println(current);
		}
		
		for (int index = 0; index < numbers.length; index += 1)
		{
			numbers[index] = index + 1;
			
			System.out.println(numbers[index]);
		}
		
		words = new String [] {"one", "two", "three", "four", "five"};
	}
}
