package numberFlip;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumberFlipVersion1 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		String input = read.readLine();

		int convertNumber = Integer.parseInt(input);
		
		for ( int no = input.length()-1; no >= 0; no-- ) {
			System.out.print(input.charAt(no));
		}
		
	}
	
}
