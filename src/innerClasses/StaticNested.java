package innerClasses;

public class StaticNested {
	
	static int age=10;
	
	static class Nested{
		void getAge() {
			System.out.println(age);
		}
	}
	

	public static void main(String[] args) {
		StaticNested.Nested nested = new StaticNested.Nested();
		nested.getAge();

	}

}
