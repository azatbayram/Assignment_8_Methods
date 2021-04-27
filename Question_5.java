package assignment_8_Methods;
import java.util.Scanner;

public class Question_5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter some integer number:");
		int num=sc.nextInt();
		sign(num);
		
	}

	public static void sign(int num) {
		
		if(num==0) {
			System.out.println(0);
		}
		else {
			if(num>0) {
				System.out.println(1);
			}
			else {
				System.out.println(-1);
			}
		}
		
	}

}
