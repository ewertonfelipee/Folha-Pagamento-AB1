package Employeer;
import Card.Card;
import DateHour.Date;
import Payment.PaymentSchedule;

public class CompositeEmpregado  implements ComponentEmpregado{
	
	private String name;
	private String address;
	private int numberIdentification;
	private boolean belongSyndicate;
	private int uniqueSNumberSyndicate;
	private double syndicalFee = 0;
	private double serviceFee = 0;
	private Date lastPayment;
	private double grossSalary = 2000;
	private Card cardPoint = new Card();
	private PaymentSchedule paymentSchedule;

	public double getServiceFee() {
		return serviceFee;
	}

	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}

	public double getGrossSalary() {
		return grossSalary;
	}
	
	public Date getLastPayment() {
		return lastPayment;
	}
	
	public PaymentSchedule getPaymentSchedule() {
		return paymentSchedule;
	}
		
	public void addServiceFee(float fee) {
		this.serviceFee += fee;
	}

	public double getSyndicalFee() {
		return syndicalFee;
	}
	
	public Card getCardPoint() {
		return cardPoint;
	}

	public int getNumberIdentification() {
		return this.numberIdentification;
	}

	public int getuniqueSNumberSyndicate() {
		return this.uniqueSNumberSyndicate;
	}

	public boolean isbelongSyndicate() {
		return belongSyndicate;
	}

	int SyndicalTax(){
		if(belongSyndicate)
			return 1;
		return 0;
	}
	
	public void setServiceFee(float serviceFee) {
		this.serviceFee = serviceFee;
	}

	public void setGrossSalary(float grossSalary) {
		this.grossSalary = grossSalary;
	}

	public void setLastPayment(Date lastPayment) {
		this.lastPayment = lastPayment;
	}

	public void setPaymentSchedule(PaymentSchedule paymentSchedule) {
		this.paymentSchedule = paymentSchedule;
	}

	public void setSyndicalFee(float syndicalFee) {
		this.syndicalFee = syndicalFee;
	}

	public void setbelongSyndicate(boolean belongSyndicate) {
		this.belongSyndicate = belongSyndicate;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCardPoint(Card cardPoint) {
		this.cardPoint = cardPoint;
	}

	public void setNumberIdentification(int numberIdentification) {
		this.numberIdentification = numberIdentification;
	}

	public void setuniqueSNumberSyndicate(int uniqueSNumberSyndicate) {
		this.uniqueSNumberSyndicate = uniqueSNumberSyndicate;
	}

	@Override
	public int getExtraHours() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPercentageSales() {
		// TODO Auto-generated method stub
		return 0;
	}

}
