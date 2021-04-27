package assignment_8_Methods;

public class Question_11 {

	public static void main(String[] args) {
		
		System.out.println(c_profits(500, 300));
		System.out.println(c_profits(500, 600));
		System.out.println(c_profits(500, 500));
		
		

	}

	public static String c_profits(int buyPrice, int sellPrice) {
		
		if(buyPrice<sellPrice) {
			return "profit";
		}
		else if(buyPrice>sellPrice) {
			return "loss";
		}
		else {
			return "no loss";
		}
		
	}

}
