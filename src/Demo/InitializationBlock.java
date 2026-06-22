package Demo;

public class InitializationBlock {
	/**
	 * Initialization Block 
	 * --> It will be executed every time when an instance is created.
	 * --> 
	 * 
	 * @param args
	 */
	{
		System.out.println("This is Initiazation Block");
	}

	public InitializationBlock() {
		System.out.println("Default constructor");
	}

	public InitializationBlock(int x) {
		System.out.println("Param Constructor is called");

	}

	public static void main(String[] args) {
		InitializationBlock ib = new InitializationBlock();
		InitializationBlock ibk = new InitializationBlock(10);
	}

}
