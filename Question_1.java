package assignment_8_Methods;
import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {
		
		plus();

	}

	public static void plus() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int firstNumber=sc.nextInt();
		System.out.println("Enter second number:");
		int secondNumber=sc.nextInt();
		
		System.out.println("Result: " + (firstNumber+secondNumber));
		
	}

}
