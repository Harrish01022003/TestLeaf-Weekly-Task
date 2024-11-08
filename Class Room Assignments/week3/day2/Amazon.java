package week3.day2;

public class Amazon extends CanaraBank{

	public static void main(String[] args) {
		Amazon obj = new Amazon();
		obj.cardPayment();
		obj.cashOnDelivery();
		obj.internetBanking();
		obj.upiPayment();
		

	}

	@Override
	void recordPaymentDetails() {
		System.out.println("Payment detailes recorded ");
		
	}

}
