package assignment_8_Methods;
import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) {
		
		cube();

	}

	public static void cube() {
		int result=1;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter some integer number:");
		int num=sc.nextInt();
		
		for(int i=0; i<3; i++) {
			result*=num;
		}
		
		System.out.println("Cube of that number: " + result);
		
		/*num=num*num*num;
		System.out.println("Cube of that number: " + num);
		*/
	}

}
