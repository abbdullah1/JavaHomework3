package abstractDemo;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		customerManager.datebaseManager  = new OracleDatabaseManager();
		customerManager.getCustomers();

	}

}
