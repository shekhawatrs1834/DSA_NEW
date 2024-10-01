
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Employee {
    int empNo;
    String empName;
    Date joinDate;
    char desigCode;
    String department;
    double basic;
    double hra;
    double it;

    public Employee(int empNo, String empName, String joinDate, char desigCode, String department, double basic, double hra, double it) throws ParseException {
        this.empNo = empNo;
        this.empName = empName;
        this.joinDate = new SimpleDateFormat("dd/MM/yyyy").parse(joinDate);
        this.desigCode = desigCode;
        this.department = department;
        this.basic = basic;
        this.hra = hra;
        this.it = it;
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        try {
            employees[0] = new Employee(1001, "Ravinder", "01/04/2009", 'e', "R&D", 20000, 8000, 3000);
            employees[1] = new Employee(1002, "Raj", "23/08/2012", 'c', "PM", 30000, 12000, 9000);
            employees[2] = new Employee(1003, "Rahul", "12/11/2008", 'k', "Acct", 10000, 8000, 1000);
            employees[3] = new Employee(1004, "Navya", "29/01/2013", 'r', "Front Desk", 12000, 6000, 2000);
            employees[4] = new Employee(1005, "Ranjan", "16/07/2005", 'm', "Engg", 50000, 20000, 20000);
           
        } catch (Exception e) {
            System.out.println(e);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();
        scanner.close();

        boolean found = false;
        for (Employee emp : employees) {
            if (emp != null && emp.empNo == empId) {
                System.out.println("Emp No: " + emp.empNo);
                System.out.println("Emp Name: " + emp.empName);
                System.out.println("Department: " + emp.department);
                switch (emp.desigCode) {
                    case 'e':
                        System.out.println("Designation: Engineer");
                        break;
                    case 'c':
                        System.out.println("Designation: Consultant");
                        break;
                    case 'k':
                        System.out.println("Designation: Clerk");
                        break;
                    case 'r':
                        System.out.println("Designation: Receptionist");
                        break;
                    case 'm':
                        System.out.println("Designation: Manager");
                        break;
                    default:
                        System.out.println("Designation: Unknown");
                }
                double da = getDA(emp.desigCode);
                double salary = emp.basic + emp.hra + da + emp.it;
                System.out.println("Salary: " + salary);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found");
        }
    }

    private static double getDA(char desigCode) {
        switch (desigCode) {
            case 'e':
                return 20000;
            case 'c':
                return 32000;
            case 'k':
                return 12000;
            case 'r':
                return 15000;
            case 'm':
                return 40000;
            default:
                return 0;
        }
    }
}

