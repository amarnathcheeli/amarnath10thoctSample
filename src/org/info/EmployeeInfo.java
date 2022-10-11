package org.info;

public class EmployeeInfo {
    private void employee() {
    System.out.println("Employee Details");
	}
    private void employee(String name) {
    System.out.println("employee name "+ name);
	}
    private void employee(int age ) {
    System.out.println("employee age " + age);
	}
    private void employee(long phono, long accono) {
    System.out.println(" employee phono " + phono);
    System.out.println("employee accono " + accono);
	}
    private void employee(String city, long addharno, int id) {
    	System.out.println("employee city "+ city);
    	System.out.println("employee addharno " + addharno);
    	System.out.println("employee id " + id);
     }
    public static void main(String[] args) {
		EmployeeInfo a = new EmployeeInfo();
		a.employee();
		a.employee("ram");
		a.employee(32);
		a.employee(987653218l, 6099908275l);
		a.employee("hyd", 609990823578678l, 102);
		
	}
}
