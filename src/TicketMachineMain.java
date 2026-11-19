import java.util.Scanner; 
public class TicketMachineMain {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		TicketMachine machine = new TicketMachine(300);
		
		System.out.printf("Τιμή εισιτηρίου: %d cents | Υπόλοιπο: %d cents %n", machine.getPrice(), machine.getBalance());
		
		boolean running = true;

		while (running) {
			System.out.println("-------------------------------------");
			System.out.println();
			System.out.println("1. Εισαγωγή χρημάτων");
			System.out.println("2. Εκτύπωση εισιτηρίου");
			System.out.println("3. Επιστροφή ρέστων");
			System.out.println("4. Άδειασμα ταμείου (Διαχειριστής)");
			System.out.println("0. Έξοδος");
			System.out.println();
			System.out.println("-------------------------------------");
			System.out.print("\n Επιλογή: ");
			int choice = sc.nextInt();
			switch (choice) {
			
				case 1 -> {
					System.out.println("Εισάγετε το απαιτούμενο ποσό: ");
					int value = sc.nextInt();
					machine.insertMoney(value);
				}
				case 2 -> {
					machine.printTicket();
				}
				case 3 -> {
					System.out.println("Επιστροφή ρέστων: " + machine.refundBalance() + " cents.");
				}
				case 4 -> {
					System.out.println("Συνολικές εισπράξεις ταμείου: " + machine.emptyMachine() + " cents.");
				}
				case 0 -> {
					System.out.println("Έξοδος από το σύστημα.");
					running = false;
				}
				default -> System.out.println("Πληκτρολογήστε μία από τις παραπάνω επιλογές.");
			}
			
		}
		sc.close();

	}
	
}
