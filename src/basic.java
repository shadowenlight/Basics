import java.util.Scanner;
public class basic {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a, b;
		char operator='+';
		
		System.out.print("Enter 1st number: ");
		a = scanner.nextInt();
		
		System.out.print("Enter 2nd number: ");
		b = scanner.nextInt();
		
		while(operator!='e') {
			System.out.print("Select an operator(+, -, *, /): ");
			operator=scanner.next().charAt(0);
		
			if(operator=='+')
				System.out.printf("a + b = %d\n", a+b);
			else if(operator=='-')
				System.out.printf("a - b = %d\n", a-b);
			else if(operator=='*')
				System.out.printf("a * b = %d\n", a*b);
			else if(operator=='/')
				System.out.printf("a / b = %d\n", a/b);
		}
		scanner.close();
	}
}
