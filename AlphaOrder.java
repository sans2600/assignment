/*
 * 3) Initialize two character variables in a program and display the characters in alphabetical order.
Example1) if the first character is 's' and second character is 'e' then the output should be e,s
Example2) if the first character is 'a' and second character is 'e', then the output should be a,e

 */

package Day1;
import java.util.Scanner;

public class AlphaOrder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st Character :");
		char a = sc.next().charAt(0);
		
		System.out.println("Enter 2st Character :");
		char b = sc.next().charAt(0);
		
		if(a<b) 
		{
			System.out.println(a + "," + b);
		}
		else
		{
			System.out.println(b + "," + a);
		}
	}

}
