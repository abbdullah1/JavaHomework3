package overriding;

public class BaseLoanManager {
public double calculate(double tutar) {// eger public ile double arasinda "final" yazarsak overridingi yasaklar
	return tutar*1.18;
}
}
