
public class TicketMachineMain {
	public static void main (String[] args) {
		
		TicketMachine machine = new TicketMachine(300);
		
		System.out.println("Τιμή εισιτηρίου: " + machine.getPrice() + " cents");
		
		machine.insertMoney(450);
		
		machine.printTicket();
		
		System.out.println(machine.refundBalance());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(machine.getBalance());

	}
	
}
