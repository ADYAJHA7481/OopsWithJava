//WAP to enter name , salary of two employees and show whose salary is higher,use proper user defined methods.
import java.util.Scanner;
public class ex4 {
    
    public static void EmpDetails(String[] name, double[] salary) {
        Scanner sc= new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter details for Employee " + (i + 1));
            System.out.print("Name: ");
            name[i] = sc.nextLine();
            System.out.print("Salary: ");
            salary[i] = sc.nextDouble();
            sc.nextLine();
        }
    }
    
    public static void compareSalary(String[] name, double[] salary) {
        if (salary[0] > salary[1]) {
            System.out.println(name[0] + " has a higher salary than " + name[1]);
        } else if (salary[0] < salary[1]) {
            System.out.println(name[1] + " has a higher salary than " + name[0]);
        } else {
            System.out.println("Both employees have the same salary.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] name = new String[2];
        double[] salary = new double[2];
        
        EmpDetails(name, salary);
        compareSalary(name, salary);
        
        sc.close();
    }
}