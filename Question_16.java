package assignment_8_Methods;

public class Question_16 {

	public static void main(String[] args) {
		
		System.out.println(simpleRoomBook(true, 6, 9, 2018));

	}

	public static boolean simpleRoomBook(boolean available, int month, int day, int year) {
		
		if(available) {
			
			if(year==2018) {
				
				if(month==7 && 1<=day && day<=8) {
					return false;
				}
				else {
					return true;
				}
				
			}
			else {
				return false;
			}
			
		}
		else {
			return false;
		}
		
	}

}
