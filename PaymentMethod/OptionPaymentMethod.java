package PaymentMethod;

import java.util.Scanner;

public class OptionPaymentMethod {

    private StatePaymentMethod paymentMethod = null;
    Scanner input = new Scanner(System.in);

    public void paymentMethod() {
		
		if(paymentMethod != null)
		System.out.printf("Current method: %s\n", this.paymentMethod);
		
		int method = 0;

		do {
			System.out.println("Enter the new method that you want:");
			System.out.println("[1] Check by mail");
			System.out.println("[2] Check in hands");
			System.out.println("[3] Deposit in account bank");
			method = input.nextInt();
			if(method <= 0 || method >= 4 )
			System.out.println("Invalid input!");
		}
		while(method <= 0 || method >= 4 );
	}
	
	public void setPaymentMethod(int method) {
		if(method == 1)
			this.paymentMethod = new CheckMail();
		else if(method == 2)
			this.paymentMethod = new CheckHand();
		else
			this.paymentMethod = new DepositAccount();
	}

    public int getPaymentMethod() {
		return this.paymentMethod.toInt();
	}

}
