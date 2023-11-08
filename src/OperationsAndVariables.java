import java.util.Scanner;

public class OperationsAndVariables{
	public static void main(String[] args) {
		
		char o;
			
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Enter a value: ");
			int x = scan.nextInt();
			System.out.print("Enter a second value: ");
			int y = scan.nextInt();
			System.out.println("Choose an operation");
			o=(char) scan.next().charAt(0);
			
			
			System.out.printf("x %c y = ", o);
			if(o == '+') 
				System.out.print(x + y);
			else if(o == '-')
				System.out.print(x - y);
			else if(o == '*')
				System.out.print(x * y);
			else if(o == '/')
				System.out.print(x / y);
			else if(o == '%')
				System.out.print(x % y);
		}
	}
}