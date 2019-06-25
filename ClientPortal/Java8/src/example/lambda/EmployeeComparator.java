package example.lambda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class Employee{
	
	String name;
	Integer EmployeeID;
	Integer salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getEmployeeID() {
		return EmployeeID;
	}
	public void setEmployeeID(Integer employeeID) {
		EmployeeID = employeeID;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Employee(String name, Integer employeeID, Integer salary) {
		super();
		this.name = name;
		EmployeeID = employeeID;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", EmployeeID=" + EmployeeID + ", salary=" + salary + "]";
	}
	
	
	
}
public class EmployeeComparator {

	public static void main(String[] args) {
		
		List<Employee> emp = new ArrayList<>();
		
		Employee emp1 = new Employee("Arpit", 1000522, 1432);
		Employee emp2 = new Employee("Himi", 1000523, 1344);
		Employee emp3 = new Employee("Govind", 1000524, 1124);
		
		emp.add(emp1);
		emp.add(emp2);
		emp.add(emp3);
		
		//sorting on the basis of name 
		System.out.println("Before Sorting Name....");
		
		emp.forEach((n) -> System.out.println(n));
		
		Collections.sort(emp,(p1,p2) -> {
			return p1.name.compareTo(p2.name);	
		});
		
		System.out.println("After Sorting Name....");
		emp.forEach((n) -> System.out.println(n));
		
		//sorting on the basis of EmployeeId
				System.out.println("\nBefore Sorting on the basis of Employee ID....");
				
				emp.forEach((n) -> System.out.println(n));
				
				Collections.sort(emp,(p1,p2) -> {
					return p1.EmployeeID.compareTo(p2.EmployeeID);
				});
				
				System.out.println("After Sorting on the basis of Employee ID..");
				emp.forEach((n) -> System.out.println(n));
		
				//sorting on the basis of Salary
				System.out.println("\nBefore Sorting on the basis of Salary....");
				
				emp.forEach((n) -> System.out.println(n));
				
				Collections.sort(emp,(p1,p2) -> {
					return p1.salary.compareTo(p2.salary);
				});
				
				System.out.println("After Sorting on the basis of Salary..");
				emp.forEach((n) -> System.out.println(n));
		
				
				
//				using lambda to filter data 
				
				Stream<Employee> filtered_data = emp.stream().filter(p -> p.EmployeeID == 1000522);
	 
				filtered_data.forEach(Employee -> System.out.println(Employee));

	}

}
