import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class JavaReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String hello = "Hello world";

		System.out.println(hello);
		
		//Program to calculate the area of the circle
		double r = 1.0;
		double area = 0.0;
		DecimalFormat outputPattern = new DecimalFormat("##.00%");

		
		area = Math.PI * r * r;
		System.out.println("The area of the circle with a radius of " + r + " is " +outputPattern.format(area));
		
		//Testing floating-point division by 0
		double divisor = 4.0, dividend = 0.0;
		int integer = 1;
		
		System.out.println("The result is: " + (divisor/integer));
		
		//Testing null object reference
		String helloTest = "";
		System.out.println(helloTest.length());
		
		//Getting input from user
		System.out.println("--------------------------------------------------------------------");
		System.out.println("COLOR TESTER! THIS GAME WILL SEE IF YOU KNOW YOUR COLORS!");
		
		String[] validColors = {"green", "blue", "red", "yellow", "orange", "purple", "gray"};
		boolean next = true;
		int right = 0;
		int count = 0;
		do {
			System.out.println("Round " + (count + 1));
			Scanner scan = new Scanner (System.in);
			System.out.print("Please enter a color > ");
			String color = scan.next().toLowerCase();
			//If the color is a "valid" color inform user
			if(Arrays.asList(validColors).contains(color))
			{
			System.out.println("Your entered the color " + color);
			right++;
			
			}
			//If the color is not a "valid" color notify user
			else
				System.out.println(color + " is not a recognized color");
			//Increment the number of times the user has answered
			count++;
			//Inform the user how many colors they have gotten right out of the total number entered
			System.out.println("You have entered " + right + " out of " + count +" colors correctly!");
			
			//Ask the user if they want to continue
			System.out.print("Do you want to continue? (ENTER Y IF YOU DO) ");
			String answer = scan.next().toUpperCase();
			if(answer.equals("Y")==false)
				next = false;
		}while (next == true);

	}

}
