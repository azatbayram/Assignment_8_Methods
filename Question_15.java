package assignment_8_Methods;
import java.util.Scanner;

public class Question_15 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Type what to do:");
		String task=sc.nextLine();
		System.out.println("Enter task ID:");
		int nextId=sc.nextInt();
		System.out.println("Enter current task ID:");
		int currentId=sc.nextInt();
		
		System.out.println(validateTask(!(task.isEmpty()),nextId,currentId));
		

	}

	public static boolean validateTask(boolean task, int nextId, int currentId) {
		
		if(task && nextId==currentId+1) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
