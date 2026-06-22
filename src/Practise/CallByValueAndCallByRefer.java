package Practise;

public class CallByValueAndCallByRefer {

	int p = 50;
	int q = 90;

	public static void main(String[] args) {
		CallByValueAndCallByRefer obj = new CallByValueAndCallByRefer();

		int x = 20;
		int y = 30;
		obj.sum(x, y); // call by value or pass by value
		obj.swap(obj);

	}

	public void sum(int a, int b) {
		a = 50;
		b = 40;
		int c = a + b;
		System.out.println(c);
	}

	public void swap(CallByValueAndCallByRefer t) {
//		t.p = t.p+t.q;
//		t.q = t.p-t.q;
//		t.p = t.p-t.q;

		int temp;
		temp = t.p;
		t.p = t.q;
		t.q = temp;
		System.out.println("The Value of p after swap:" + p);
		System.out.println("The Value of q after swap:" + q);
	}

}
