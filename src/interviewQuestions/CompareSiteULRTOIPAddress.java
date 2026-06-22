package interviewQuestions;

import java.net.MalformedURLException;
import java.net.URL;

public class CompareSiteULRTOIPAddress {

	public static void main(String[] args) {

		try {
			System.out.println(new URL("https://app.hubspot.com").equals(new URL("https://104.19.154.83")));
//			System.out.println(new URL("https://www.amazon.in").equals(new URL("https://104.84.233.186")));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
