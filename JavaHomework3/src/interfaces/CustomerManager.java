package interfaces;

public class CustomerManager  {
	private ICustomerDal customerDal;
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal=customerDal;
	}
 public void add() {
	 // businnies codding
	 customerDal.Add();
 }
}
