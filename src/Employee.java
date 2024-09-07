public class Employee {
    int EmployeeID;
    int EmployeeSalary;
    String EmployeeName;
    String EmployeeAddress;
    void display(){
        System.out.println("Employee ID: " + EmployeeID);
        System.out.println("Employee Salary: " + EmployeeSalary);
        System.out.println("Employee Name: " + EmployeeName);
        System.out.println("Employee Address: " + EmployeeAddress);
    }
    public static void main(String[] args){
        Employee emp = new Employee();
        emp.EmployeeID = 1;
        emp.EmployeeSalary = 1000;
        emp.EmployeeName = "John Doe";
        emp.EmployeeAddress = "123 Main St";
        emp.display();
    }
}
