import java.util.ArrayList;
import java.util.Scanner;

public class methods {	
	
	static void even(ArrayList<Integer> al) {		
		
		if(al != null) {
			
			
			for(int i=0;i<al.size();i++) {
				if((al.get(i) % 2) != 0) {
					al.remove(i);
				}
			}
		}
						
		else 
			System.out.println("Array is empty.");		
	} 
	
	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			int e = 1;
			
			System.out.println("Pass an array to filter all odd integers\n==============================");
			
			ArrayList<Integer> al = new ArrayList<Integer>();
			
			while(e > 0) {
				e = scan.nextInt();
				if(e <= 0)
					break;
				al.add(e);
			}
			
			System.out.println("Before filtering: ");
			for(int i=0;i<al.size();i++) 
				System.out.print(al.get(i));
			
			even(al);
			
			System.out.println("\nAfter filtering: ");
			for(int i=0;i<al.size();i++) 
				System.out.print(al.get(i));
		}
	}
}