package Demo;

public class StaticBlock {
	
	/** Static Block
	 * If we associate static keyword to a block of then it is termed as static block.
	 * ---> Used for Initialization of class
	 * ---> The code in static block is executed only once when the class is loaded into memory.
	 * ---> Static block can be printed without Main method(with JDK <1.6)
	 * ---> Static block is executed before calling to construactor.
	 * ---> A class can have any no.of static blocks and they can appear anywhere 
	 * 		in the class body, during runtime they will be called in the order they are in code.
	 * 
	 */
	
	
	static {
		System.out.println("This is static block");
	}

}
