package assignment_8_Methods;

public class Question_13 {

	public static void main(String[] args) {
		
		System.out.println(waterTax(101));

	}

	public static double waterTax(double i) {
		
		if(i<=50) {
			return i*0.6;
		}
		else if(i<=100) {
			return i*0.9;
		}
		else if(i<=150) {
			return i*1.395;
		}
		else {
			return i*1.562;
		}
		
	}

}
