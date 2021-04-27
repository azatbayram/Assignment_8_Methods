package assignment_8_Methods;

public class Question_14 {

	public static void main(String[] args) {
		
		System.out.println(threeLocks(true, true, false));
		System.out.println(threeLocks(false, false, true));
		System.out.println(threeLocks(false, true, false));
	}

	public static boolean threeLocks(boolean a, boolean b, boolean c) {
		
		if((a && b) || c) {
			return true;
		}
		else {
			return false;
		}
	}

}
