import java.util.Scanner;

public class forLoop {
	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Enter an integer: ");
			int factorial = scan.nextInt();		
			
			for(int i = factorial; i > 1; i--) 
				factorial *= (i - 1);					
					
			System.out.printf("Factorial of the integer is: %d", factorial);
		}
	}
}
