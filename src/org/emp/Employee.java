package org.emp;

public class Employee {
	private void employeeId() {
		System.out.println("Employee ID : 0512");

	}
private void employeeName() {
	System.out.println("Employee Name : Ajay");

}
private void employeeDob() {
	System.out.println("Employee DOB : 05/12/1991");

}
private void employeePhone() {
	System.out.println("Employee Phone : 9629444382");

}
private void employeeEmail() {
	System.out.println("Employee Email : aajay91@gmail.com");

}
private void employeeAddress() {
	System.out.println("Employee Adress : salem");

}
public static void main(String[] args) {
	Employee e = new Employee();
	e.employeeId();
	e.employeeName();
	e.employeeDob();
	e.employeePhone();
	e.employeeEmail();
	e.employeeAddress();
	
}

}
