package dice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DiceVersion2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int convertNumber = Integer.parseInt(input);
		int firstNumber = 0;
		int secondNumber = 1;
		
		for ( int first = 1; first < 7; first++ ) {
			firstNumber++;
			for ( int second = 1; second < 7; second++ ) {
				int sum = firstNumber + secondNumber;
				
				if ( convertNumber == sum ) {
					System.out.println(firstNumber+" "+secondNumber);
				}
				
				secondNumber++;
			}
		}
		
	}
	
}