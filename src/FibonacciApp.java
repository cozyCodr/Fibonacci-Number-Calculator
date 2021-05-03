import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciApp {
	
	//Fibonacci method using int's
	public static int fibonacci(int n) {
		
		ArrayList<Integer> fiboNumber = new ArrayList<Integer>();
		fiboNumber.add(0);
		fiboNumber.add(1);
		
		int sum = 0;
		
		//Do the Math
		if (n > 1 )	{
			for(int x=0; x <= n-2; x++) {
				sum = fiboNumber.get(x) + fiboNumber.get(x+1);
				fiboNumber.add(sum);
			}
		}
		return fiboNumber.get(n);
	}
	
	//Fibonacci App
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter nth Fibonacci number you want to know: ");
		
		int n =input.nextInt();
		int nthFiboNumber = fibonacci(n);
		
		System.out.printf("%s%d%s%d", "The ", n, "th Fibonacci Number is ", nthFiboNumber );
		
		
		/** ********************************************************************************
		 * 
		 *      While using int, the largest Fibonacci number 
		 *          i would Calculate was the 46th;
		 *  
		 ********************************************************************************** */
	}
}
