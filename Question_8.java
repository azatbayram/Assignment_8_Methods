package assignment_8_Methods;
import java.util.Scanner;

public class Question_8 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter integer number:");
		int number=sc.nextInt();
		fib(number);

	}

	public static void fib(int num) {
		int pre1=0;
		int pre2=1;
		int sum=0;
		for(int i=1; i<num; i++) {
			
			sum=pre1+pre2;
			pre1=pre2;
			pre2=sum;
			if(i==num-2) {
				break;
			}
			//System.out.print(sum + " ");
		}
		
		System.out.println(sum);
		
		
	}

}
