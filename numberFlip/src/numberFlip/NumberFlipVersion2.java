package numberFlip;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumberFlipVersion2 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		String input = read.readLine();
		int convertNum = Integer.parseInt(input);
		
		System.out.println(flip(convertNum));
		
	}
	
	public static int flip(int num) {
		
		int result = 0;
		
		while( num!= 0 ) {
			result = result * 10 + num % 10;
			num /= 10;
		}
		
		return result;
	}
	
}
