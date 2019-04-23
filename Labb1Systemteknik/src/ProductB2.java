import java.util.Random;

public class ProductB2 extends AbstractProductB{

	@Override
	public void productB() {
		Random diceNumber = new Random();
	    int rollValue = diceNumber.nextInt(20) + 1;
	    System.out.println("D20 roll: " +rollValue);	
	    
	}


}
