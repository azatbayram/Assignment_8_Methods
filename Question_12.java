package assignment_8_Methods;

public class Question_12 {

	public static void main(String[] args) {
		
		System.out.println(hamletQuote(true, true));
		System.out.println(hamletQuote(true, false));
		System.out.println(hamletQuote(false, false));

	}

	public static boolean hamletQuote(boolean b, boolean c) {
		
		if(b || c) {
			return true;
		}
		else {
			return false;
		}
	}

}
