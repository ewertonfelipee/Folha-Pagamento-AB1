package Payment;

import java.util.Scanner;

public class PaymentSchedule {

	private String schedule;
	private String day = "0";
	private boolean monthly=false;
	private boolean weekly=false;
	private String dayWeekly = null;
	
	
	Scanner input = new Scanner(System.in);
	
	public PaymentSchedule(String day,boolean monthly,boolean weekly){
		
		
	    if(monthly && !weekly){
	        this.schedule = "Monthly " + day;
	        this.monthly = true;
	    }
	    else if(!monthly && weekly){
	        this.schedule = "Weekly " + day;
	        this.weekly = true;
	    
	    }
	    
	    this.day = day;
	    this.dayWeekly = "Monday";
	}
	
	public PaymentSchedule(){
		
		System.out.printf("[1] Monthly [2] Weekly%n");

        if(input.nextInt() == 1){
            System.out.printf("Day: ");
            this.day = input.next();
            this.schedule = "Monthly " + this.day;
        }else{
            System.out.printf("How many weeks ?%n");
            this.day = input.next();
            
            int option;
            do {
            	System.out.println("Day of the week ?");
                System.out.printf("[1] Monday%n[2] Tuesday%n[3] Wednesday%n"
                + "[4] Thursday%n[5] Friday%n");

                option = input.nextInt();
                switch(option) {
    	            case 1:
    	            	this.dayWeekly = "Monday";
    	            	break;
    	            case 2:
    	            	this.dayWeekly = "Tuesday";
    	            	break;
    	            case 3:
    	            	this.dayWeekly = "Wednesday";
    	            	break;
    	            case 4:
    	            	this.dayWeekly = "Thursday";
    	            	break;
    	            case 5:
    	            	this.dayWeekly = "Friday";
    	            	break;
    	            default:
    	            	System.out.println("Invalid input!");
    	            	option = -1;
    	            	break;
                }
            }while(option == -1);
            
            this.schedule = "Weekly " + this.day + " " + this.dayWeekly;
        }
	}

	public String getSchedule() {
		return schedule;
	}

	public String getDay() {
		return day;
	}

	public boolean isMonthly() {
		return monthly;
	}

	public boolean isWeekly() {
		return weekly;
	}

	public String getDayWeekly() {
		return dayWeekly;
	}

	public Scanner getInput() {
		return input;
	}

}
