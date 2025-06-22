//Performing Constructor


package oops_Practice;


public class Account {
	
	private int Accid;
	private String name;
	private double bal;
	
	public Account() {   //Constructor Creation..
		
		Accid = 101;
		name = "Durga ";
		bal = 50000.00;
		System.out.println("Constructor Called..............");
		System.out.println("---------------------------");
		
	}
	
	public void display() {
		
		System.out.println("Account ID :" + Accid);
		System.out.println("Account holder name :" + name);
		System.out.println("Account Balance :" + bal);
		
	
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account obj = new Account();
		obj.display();

	}

}
