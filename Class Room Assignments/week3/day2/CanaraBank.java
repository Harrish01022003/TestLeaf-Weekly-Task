package week3.day2;

public abstract class CanaraBank implements Payments {
	@Override
	public void cardPayment() {
		System.out.println("Card payments");
	}
	@Override
	public void cashOnDelivery() {
		System.out.println("cash on delivery");
	}
	@Override
	public void internetBanking() {
		System.out.println("internet banking");
	}
	@Override
	public void upiPayment() {
		System.out.println("UPI Payment");
	}
	
	abstract void recordPaymentDetails();



}
