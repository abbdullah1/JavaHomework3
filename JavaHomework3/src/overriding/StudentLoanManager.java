package overriding;

public class StudentLoanManager extends BaseLoanManager {
public double calculate(double tutar) {
	return tutar*1.10;
}
}
