package asgn4;
import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		String first;
		String last;
		
		System.out.println("Enter your first name: ");
		first=input.nextLine();
		System.out.println("Enter your last name: ");
		last=input.nextLine();
		
		first = first.substring(1, 2).toUpperCase() + first.substring(2) + first.substring(0, 1) + "ay";
		
		last = last.substring(1, 2).toUpperCase() + last.substring(2) + last.substring(0, 1) + "ay";
		
		String pigLatinName = first + " " + last;
		
		System.out.println("Your name in pig latin is " + pigLatinName + ".");
		input.close();
	}

}
