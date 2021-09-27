package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class String {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		java.lang.String input = br.readLine();
		
		java.lang.String[] convert = input.split("");
		
		for (int i = convert.length; i < 0; i--) {
			int no = 0;
			java.lang.String[] turnResult = null;
			turnResult[no] = convert[i];
			no++;
		}
		
		System.out.println("Hello Goorm! Your input is " + input);
	}
	
}
