/*Write a Java program to create a class called Employee with private
 * instance variables employee id, employee name, and employee salary.
 * Provide public getter and setter methods to access and modify the id
 * and name variables, but provide a getter method for the salary variable
 * that returns a formatted string.
 */

public class Employee {
    // private instance
    private String employeeId;
    private String employeeName;
    private double employeeSalary;

    // setter methods
    public void setEmployeeId(String employeeId){
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;   
    }

    public void setEmployeeSalary(double employeeSalary){
        this.employeeSalary = employeeSalary;
    }

    // getter methods
    public String getEmployeeId(){
        return employeeId;
    }

    public String getEmployeeName(){
        return employeeName;
    }

    public String getFormattedSalary(){
        return String.format("PHP %,.2f", employeeSalary);
    }

        public static void main (String[]args){

        Employee employeeInfo = new Employee();

        employeeInfo.setEmployeeId("COM241");
        employeeInfo.setEmployeeName("Renz Viloria");
        employeeInfo.setEmployeeSalary(5000);

        System.out.println("Employee's Info: ");
        System.out.println("Employee ID: " + employeeInfo.getEmployeeId());
        System.out.println("Employee Name: " + employeeInfo.getEmployeeName());
        System.out.println("Employee's Salary: " + employeeInfo.getFormattedSalary());
    }
}   