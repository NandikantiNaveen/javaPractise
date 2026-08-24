package innerClasses;

public class AnonymousInnerClass {
	
	static Runnable r = new Runnable() {
	    @Override
	    public void run() {
	        System.out.println("Running from anonymous class");
	    }
	};
	 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		r.run();
	}

}
