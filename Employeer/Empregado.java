package Employeer;
import Card.Card;
import DateHour.Date;
import Payment.PaymentSchedule;

public class Empregado {
	
	private String name;
	private String addres;
	private int numberIdentification;
	private boolean pertenceSindicato;
	private int numeroUnicoSindicato;
	private double syndicalFee = 0;
	private double serviceFee = 0;
	private Date lastPayment;
	private double grossSalary = 2000;
	private Card cardPoint = new Card();
	private PaymentSchedule paymentSchedule;

	public double getServiceFee() {
		return serviceFee;
	}

	public void setServiceFee(float serviceFee) {
		this.serviceFee = serviceFee;
	}

	public String getName() {
		return name;
	}

	public String getAddres() {
		return addres;
	}


	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(float grossSalary) {
		this.grossSalary = grossSalary;
	}

	public Date getLastPayment() {
		return lastPayment;
	}

	public void setLastPayment(Date lastPayment) {
		this.lastPayment = lastPayment;
	}

	public PaymentSchedule getPaymentSchedule() {
		return paymentSchedule;
	}

	public void setPaymentSchedule(PaymentSchedule paymentSchedule) {
		this.paymentSchedule = paymentSchedule;
	}

	public void addServiceFee(float fee) {
		this.serviceFee += fee;
	}
	public double getSyndicalFee() {
		return syndicalFee;
	}

	public void setSyndicalFee(float syndicalFee) {
		this.syndicalFee = syndicalFee;
	}

	public void setPertenceSindicato(boolean pertenceSindicato) {
		this.pertenceSindicato = pertenceSindicato;
	}


	public void setName(String name) {
		this.name = name;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public Card getCardPoint() {
		return cardPoint;
	}

	public void setCardPoint(Card cardPoint) {
		this.cardPoint = cardPoint;
	}

	public int getNumberIdentification() {
		return this.numberIdentification;
	}

	public void setNumberIdentification(int numberIdentification) {
		this.numberIdentification = numberIdentification;
	}

	public int getNumeroUnicoSindicato() {
		return this.numeroUnicoSindicato;
	}

	public void setNumeroUnicoSindicato(int numeroUnicoSindicato) {
		this.numeroUnicoSindicato = numeroUnicoSindicato;
	}

	public boolean isPertenceSindicato() {
		return pertenceSindicato;
	}	
}
