package assignment_8_Methods;
import java.util.Scanner;

public class Question_6 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter some integer number:");
		int num=sc.nextInt();
		
		next3(num);

	}

	public static void next3(int num) {
		
		System.out.println("next 3 are:");
		for(int i=0; i<3; i++) {
			System.out.print(++	num + " ");
		}
		
	}

}
