public class booleanOperators{
	public static void main(String[] args) {
		
		boolean bigger;
		
		int a = 20, b = 18;
		
		if(a > b)
			bigger = true;
		else
			bigger = false;
		
		if(bigger == true)
			System.out.println("a is biger than b");
		else
			System.out.println("a is smaller than b.");
	}
}