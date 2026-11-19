
public class TicketMachine {
	private int price;
	private int balance;
	private int total;
	
	public TicketMachine(int cost) {
		price = cost;
		balance = 0;
		total = 0;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void insertMoney(int amount) {
		if (amount <= 0) {
			System.out.println();
			System.out.println("Παρακαλώ δώστε τιμή μεγαλύτερη από 0");
			System.out.println();
		} else {
			balance += amount;
		}
			
		
	}
	
	public void printTicket() {
		if (balance >= price){
		System.out.println();
		System.out.println("#~#~".repeat(7));
		System.out.println("Το εισιτήριό σας: " + price + " cents.");
		System.out.println("Υπόλοιπο: " + (balance-price) + " cents");
		System.out.println("#~#~".repeat(7));
		System.out.println();
		balance -= price; 
		total += price;
		} else {
			System.out.println();
			System.out.println("Απομένουν ακόμη " + (price-balance) + " cents για την δυνατότητα λήψης εισιτηρίου");
			System.out.println();
		}
		
	}
	
	public int refundBalance() {
		int refund = balance;
		balance = 0;
		return refund;
	}
	
	public int getTotal() {
		
		return total;
	}
}
