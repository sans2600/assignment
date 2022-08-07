/*
 * 7) Write a program to receive a color code from the user (an Alphabhet).
The program should then print the color name, based on the color code given.
The following are the color codes and their corresponding color names.
R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White.
If color code provided by the user is not valid then print "Invalid Code".

 */


package Day1;
import java.util.Scanner;

public class ColorCode {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the code :");
		char c = sc.next().charAt(0);
		
		switch(c)
		{
		case 'R':
			System.out.println("R->Red");
			break;
		case 'G':
			System.out.println("G->Green");
			break;
		case 'B':
			System.out.println("B->Blue");
			break;
		case 'Y':
			System.out.println("Y->Yellow");
			break;
		case 'O':
			System.out.println("O->Orange");
			break;
		case 'W':
			System.out.println("W->White");
			break;
		default: System.out.println("Invalid Input");
		
		}
	}

}
