public class Employee {
    int EmployeeID;                                                       /* Creating the global variable EmployeeID which does store the employee uniq ID, this employee ID will be considered as zero value because it can be used for many classes if we initialize any value to it then all the objects created in the main method will be having the same value */
    int EmployeeSalary;                                                   /* Same applies for every method */
    String EmployeeName;
    String EmployeeAddress;
    void display(){                                                       /* Creating the method named 'display' to display all the values that has been assigned to the object */
        System.out.println("Employee ID: " + EmployeeID);                 /* The display method does not have any return type so the method has been declared as void */
        System.out.println("Employee Salary: " + EmployeeSalary);
        System.out.println("Employee Name: " + EmployeeName);
        System.out.println("Employee Address: " + EmployeeAddress);
    }
    public static void main(String[] args){
        Employee emp = new Employee();                                    /* Creating the Object 'emp' for the employee class */
        emp.EmployeeID = 1;                                               /* Accessing the Employee class variable by using the 'emp' object in the main method and initializing the value to it */emp.EmployeeSalary = 1000;
        emp.EmployeeName = "John Doe";                                    /* Same as such follows for every variable that has been initialized and assigned */
        emp.EmployeeAddress = "123 Main St";
        emp.display();                                                    /* Calling the display method to display all the values passed to the 'emp' object */


        Employee emp2 = new Employee();
        emp2.EmployeeID = 2;
        emp2.EmployeeSalary = 2000;
        emp2.EmployeeName = "John Doe";
        emp2.EmployeeAddress = "123 Main St";
        System.out.println("Employee ID: " + emp.EmployeeID);
        emp.display();                                                   /* The output for the total code is
                                                                            Employee ID: 1
                                                                            Employee Salary: 1000
                                                                            Employee Name: John Doe
                                                                            Employee Address: 123 Main St
                                                                            Employee ID: 1
                                                                            Employee ID: 1
                                                                            Employee Salary: 1000
                                                                            Employee Name: John Doe
                                                                            Employee Address: 123 Main St  */
    }
}
