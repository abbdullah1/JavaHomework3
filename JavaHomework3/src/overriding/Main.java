package overriding;

public class Main {

	public static void main(String[] args) {
		BaseLoanManager[] baseLoanManager = new BaseLoanManager[] {
				new TeacherLoanManager(),new AgricultureLoanManager(), new StudentLoanManager()	
			};
			for(BaseLoanManager Loans : baseLoanManager) {
				System.out.println(Loans.calculate(1000));
			}

	}

}
