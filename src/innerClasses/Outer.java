package innerClasses;

public class Outer {
	
	void getNumber() {
		class LocalInner{
			void getMessage() {
				System.out.println("Inside Local Inner class");
			}
		}
		LocalInner local = new LocalInner();
		local.getMessage();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer out = new Outer();
		out.getNumber();
	}

}
