public class whileLoop {
	public static void main(String[] args) {
		
		String hello = "Hello World";
		int n = hello.length(), i = 0;
		
		while(i < n) {
			System.out.println(hello.charAt(i));
			i++;
		}
	}
}
