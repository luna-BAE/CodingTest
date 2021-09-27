package dice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DiceVersion1 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int convertNumber = Integer.parseInt(input);
		int firstNumber = 0;
		int secondNumber = 0;
		
		for ( int no = 1; no < 7; no++ ) {
			firstNumber++;
			
			if ((convertNumber - firstNumber) > 7) {
				continue;
			} else {
				secondNumber = convertNumber - firstNumber;
				
				if ( secondNumber <= 0 || secondNumber > 6 ) continue;
				
				System.out.println(firstNumber+" "+secondNumber);
			}
			
		}
		
	}
	
}