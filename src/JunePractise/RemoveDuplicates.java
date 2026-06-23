package JunePractise;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub String str = "112drui217$%^droyp(*09";
		String str = "112drui217$%^droyp(*09";
		StringBuilder sb = new StringBuilder(str);

		for (int i = 0; i < sb.length(); i++) {
			for (int j = i + 1; j < sb.length(); j++) {
				if (sb.charAt(i) == sb.charAt(j)) {
					sb.deleteCharAt(i);
				}
			}
		}
		System.out.println(sb);

	}

}
