package Practise;

public class Substring {

	public static void main(String[] args) {
		String s = "ABCACABACCAACA";
		int index = 0;
		for (int i = 0; i < s.length(); i++) {
			index = s.indexOf("CA", s.indexOf("CA")+1);
		}
		System.out.println("The index of CA" + index);

	}

}
