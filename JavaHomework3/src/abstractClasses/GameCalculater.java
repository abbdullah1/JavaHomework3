package abstractClasses;

public abstract class GameCalculater {
public abstract void calculate();// bunun anlamı bu fonksiyonun defaultu olmaması ve her yerde yazılmasının kesin olması anlamaına gelir

public final void gameOver() {
	System.out.println("Game Over");
}
}

