package assignment_8_Methods;

public class Question_9 {

	public static void main(String[] args) {
		
		System.out.println(max(15,10));

	}

	public static int max(int x, int max) {
		
		if(x>max) {
			return max;
		}
		else {
			return x;
		}
	}

}
