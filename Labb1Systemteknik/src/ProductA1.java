import java.util.Random;

public class ProductA1 extends AbstractProductA{
	@Override
	public void productA() {
		Random diceNumber = new Random();
		    int rollValue = diceNumber.nextInt(6) + 1;
		    System.out.println("D6 roll: " +rollValue);
	}

}
