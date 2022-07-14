package assignments;

public class MyMobile {
	public void makecall() {
		System.out.println("makecall");
	}
	public void sendmsg() {	
		System.out.println("sendmsg");
	}
	private void payBills() {
		System.out.println("payBills");
	}

	public static void main(String[] args) {
		MyMobile MM = new MyMobile();
		System.out.println("MyMobile");
		MM.makecall();
		MM.sendmsg();
		MM.payBills();
}
}
