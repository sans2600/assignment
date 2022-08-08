/*
 * 3)  1)Inserting a record
ABC International School wants to computerize students details.
The school maintains a database of students in MYSQL.
The student table contains information related to students and is shown in the following student table structure.
Column Name Type Constraint
Rollno Number (4) Primary Key
StudentName Varchar (20) Not Null
Standard Varchar (2) Not Null
Date_Of_Birth Date
Fees Number (9,2)
 When a new student joins the school, the student record is inserted in the student table.
The valid student details are as follows:
• Rollno: Valid value is a 4-digit number
• StudentName: Valid value can contain maximum 20 letters in uppercase
• Standard : Valid values are Roman Letters representing I to X(I, II, III, IV….IX, X)
Display Student details
Write the code to display details of all the students, if no roll no. is passed, while executing the main program.
If while executing the main program, the roll no. is passed, then it should display the record of that particular student
Write a Java program to insert some records to the table and display all the records from student table

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
