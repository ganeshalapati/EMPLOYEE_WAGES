
public class Empwage {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int IS_FULL_TIME = 1;
		int WAGEPER_HOUR = 20, emphrs, empwage;
		
		double empcheck = Math.floor(Math.random() * 10) % 2;
		
		if (empcheck == IS_FULL_TIME)
			emphrs = 8;
			else 
			emphrs = 0;
		 empwage = emphrs * WAGEPER_HOUR;
           
		System.out.println("daily wage of employee is: "+empwage);

}
}