package innerClasses;

public class OuterClass {
	int x=100;
	class Inner{
		public void getNumber() {
			System.out.println(x);
		}
	}
	
	public static void main(String args[]) {
		OuterClass outer = new OuterClass();
		OuterClass.Inner inner = outer.new Inner();
		inner.getNumber();
		
	}
}
