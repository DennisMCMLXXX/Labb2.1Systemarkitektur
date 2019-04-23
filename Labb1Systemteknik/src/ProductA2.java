import java.util.Random;

public class ProductA2 extends AbstractProductA{
	@Override
	public void productA() {
		Random diceNumber = new Random();
	    int rollValue = diceNumber.nextInt(8) + 1;
	    System.out.println("D8 roll: " +rollValue);	
	    
	}

}
