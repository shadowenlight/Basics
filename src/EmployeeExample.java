public class EmployeeExample {
	private String empName;
	private int empId;
		
	public EmployeeExample(String empName, int empId) {
		this.empName = empName;
		this.empId = empId;
	}
		
	public String getName() {
		return empName;
	}
		
	public int getId() {
		return empId;
	}
		
	public static void main(String args[]) {
		EmployeeExample[] array = new EmployeeExample[2];  // new stands for create an array object
        array[0] = new EmployeeExample("Ram", 1); // new stands for create an employee object
        array[1] = new EmployeeExample("Shyaam", 2);
        
        for(int i=0;i<array.length;i++) {
        	System.out.println("Employee Name: " + array[i].empName);
        	System.out.println("Employee Id: " + array[i].empId);
        }
	}
}