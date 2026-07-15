package JunePractise;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub String str = "112drui217$%^droyp(*09";
		String str = "1112drui217$%^droyp(*09";
		//String newStr = str.replaceAll("[^a-zA-Z0-9]", "");
		//System.out.println(newStr);
		StringBuilder sb = new StringBuilder(str);

		for (int i = 0; i < sb.length(); i++) {
			for (int j = i + 1; j < sb.length(); j++) {
				if (sb.charAt(i) == sb.charAt(j)) {
					sb.deleteCharAt(j);
					j--;
					
				}
			}
		}
		System.out.println(sb.toString().replaceAll("[^a-zA-Z0-9]", ""));
	

	}

}
