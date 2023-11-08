import java.util.Random;

public class foreach {
	public static void main(String[] args) {
		
		Random r = new Random();
		
		int size = r.nextInt(20 - 1) + 1;			
		
		int[] myArray = new int[size];				

		
		for(int i=0;i<size;i++)
			if(size>10)
				myArray[i] = r.nextInt(100 - 10) + 10;
			else
				myArray[i] = r.nextInt(10 - 1) + 1;
		
		System.out.println("Array size is: " + size);
		for(int i:myArray)
			System.out.println(i);
	}
}
