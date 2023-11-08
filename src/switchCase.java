import java.util.Scanner;

public class switchCase {
	public static void main(String[] args) {
		
		int grade;
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Enter a grade: ");
			grade = scan.nextInt();
		}
		
		switch(grade) {
		case 1:
			System.out.println("Class failed.");
			break;
		case 2:
			System.out.println("Class passed under average.");
			break;
		case 3:
			System.out.println("Class passed.");
			break;
		case 4:
			System.out.println("Class passed above average.");
			break;
		case 5:
			System.out.println("Class passed with success.");
			break;
		}
	}
}
