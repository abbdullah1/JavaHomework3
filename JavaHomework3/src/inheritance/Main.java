package inheritance;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Employee employee = new Employee();
		customer.firstName = "customer1";
		employee.firstName = "employe1";
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
		employeeManager.List("ahmet");

	}

}
