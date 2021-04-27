package assignment_8_Methods;
import java.util.Scanner;

public class Question_7 {

	public static void main(String[] args) {
		   
		Scanner sc =new Scanner(System.in);
		int userInput=0;
		
		do {
			  System.out.println("enter a number between 1000-9999");
			  userInput=sc.nextInt();
			   
			    if (userInput>=1000 && userInput<=9999) {
			    	
			        System.out.println(isPalindrome(userInput));
			        break;
			    
			    }
			    else {
			    	
			    	System.out.println("invalid number");
			    	continue;
			    }
			
		}while(!(userInput>=1000 && userInput<=9999));
	  
	}

	public static boolean isPalindrome(int i) {
		
		int firstDigit=i/1000;
        int secondDigit=(i%1000)/100;
        int thirdDigit=((i%1000)%100)/10;
        int fourthDigit=((i%1000)%100)%10;
        
        if(firstDigit==fourthDigit && secondDigit==thirdDigit) {
        	return true;
        }
        else {
        	return false;
        }
	}

}
