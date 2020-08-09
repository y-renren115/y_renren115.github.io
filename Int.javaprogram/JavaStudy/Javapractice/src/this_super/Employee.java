package this_super;

public class Employee {

	private int empId;
	private String name;

	public Employee() {

	}

	public Employee(int empId,String name) {
		this.empId = empId;
		this.name = name;
	}

	public void printEmployee() {
		System.out.println("社員番号:" +this.empId);
		System.out.println("社員名:" +this.name);
	}

	public static void main(String[] args) {
		Employee mem = new Employee(123,"taguti");
		mem.printEmployee();
	}

}
