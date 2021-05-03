import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
	
	//Fibonacci Method Using double
	public static double fibonacci(int n) {
		
		ArrayList<Double>  newArray = new ArrayList<Double>(); 
		
		newArray.add(0d);
		newArray.add(1d);
		
		double sum = 0d;
		
		if (n > 1d) {
			for(int x=0; x <= n-2; x++) {
				sum = newArray.get(x) + newArray.get(x+1);
				newArray.add(sum);
			}
		}
		
		return newArray.get(n);
	}
	
	//Fibonacci App
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter nth Fibonacci number you want to know: ");
		
		int n =input.nextInt();

		double nthFiboNumber = fibonacci(n);
		
		System.out.println("The "+ n + "th Fibonacci Number is " + nthFiboNumber);
		
		/** ********************************************************************************
		 * 
		 *      While using double, the largest Fibonacci number 
		 *          i would Calculate was the 1476th;
		 *  
		 ********************************************************************************** */

		
	}
}
