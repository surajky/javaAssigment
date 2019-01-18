package assignment;

public class Inline implements Engine {

	@Override
	
	public void run() {
		//Example of Final variable, number of piston can't change
		final int numberOfPiston=6;
		// TODO Auto-generated method stub
		System.out.println("Number of piston in engine: "+numberOfPiston);
		System.out.println("Inline Engine Type");
		

	}

}
