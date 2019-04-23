import java.util.Random;

public class ProductB1 extends AbstractProductB{

	@Override
	public void productB() {
		
		Random diceNumber = new Random();
	    int rollValue = diceNumber.nextInt(12) + 1;
	    System.out.println("D12 roll: " +rollValue);	
	    	}



}
