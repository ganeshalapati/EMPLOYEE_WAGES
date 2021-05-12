
public class Monthwage {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int IS_FULL_TIME = 1;
		int DAYS_IN_MONTH = 20;
		int WAGEPER_HOUR = 20, emphrs, empwage,empwage_month;
		
		double empcheck = Math.floor(Math.random() * 10) % 2;
		
		if (empcheck == IS_FULL_TIME)
			emphrs = 8;
			else 
			emphrs = 0;
		 empwage = emphrs * WAGEPER_HOUR;
		 
		 empwage_month = empwage * DAYS_IN_MONTH;
		 
           
		System.out.println("monthly wage of employee is: "+empwage_month);

}
}

