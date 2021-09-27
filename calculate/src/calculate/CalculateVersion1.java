package calculate;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CalculateVersion1 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] convert = input.split(" ");
		
		String sign = convert[1];
		int firstNumber = Integer.parseInt(convert[0]);
		int secondNumber = Integer.parseInt(convert[2]);
		
		switch(sign){
			case "+":
				System.out.println(plus(firstNumber,secondNumber));
				break;
			case "-":
				System.out.println(minus(firstNumber,secondNumber));
				break;
			case "*":
				System.out.println(multiply(firstNumber,secondNumber));
				break;
			case "/":
				System.out.println(division(firstNumber,secondNumber));
				break;
			default:
				System.out.println("0");
				break;
		}
	
	}
	
	public static int plus(int firstNumber, int secondNumber){
		int result = firstNumber + secondNumber;
		return result;
	}
	
	public static int minus(int firstNumber, int secondNumber){
		int result = firstNumber - secondNumber;
		return result;
	}
	
	public static long multiply(int firstNumber, int secondNumber){
		int result = firstNumber * secondNumber;
		return result;
	}
	
	public static double division(int firstNumber, int secondNumber){
		if ( secondNumber == 0 ) {
			return 0;
		} else {
			double calculate = (double)firstNumber / (double)secondNumber;
			double result = Math.round(calculate*100)/100.0;
			return result;
		}
	}
	
}
