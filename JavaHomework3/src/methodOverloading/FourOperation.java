package methodOverloading;

public class FourOperation {

public int topla(int number1, int number2) {
	return number1+number2;
}
public int topla(int number1,int number2, int number3) {// buna overloading denir ve bu sayede ayni operasyonda birden farklı islem yapılabilir
	return number1+number2+number3;
}
}
