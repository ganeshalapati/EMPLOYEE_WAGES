
public class Switchcase {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int IS_FULL_TIME = 1;
		int PART_TIME = 2;
		int WAGEPER_HOUR = 20, emphrs;
		double empwage=0;
		
		double empcheck = Math.floor(Math.random() * 10) % 2;
		
		int attendance=0;
		switch(attendance)
		{
			case 0:
				    empcheck = 0;
					System.out.println("Employee is Absent");
					break;
			case 1:
				    empcheck = 1;
				 	System.out.println("Employee is Present");
					break;
			case 2:
				    empcheck = 2;
					System.out.println("Employee worked for partime");
		}
		        empwage =  (empcheck * WAGEPER_HOUR);
		        
				System.out.println("employee wage is: " +empwage);
}
}
