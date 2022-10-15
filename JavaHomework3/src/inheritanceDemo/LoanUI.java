package inheritanceDemo;

public class LoanUI {
	public void LoanCalculate(BaseLoanManager baseLoanManager) {// fakat ebevreyn class olan baseLoanManageri çağırırsak tüm varisleri bunu kulanabilir
		baseLoanManager.Calculate();
	}

}

