import java.util.Scanner;
public class EmployeeShad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String name = scanner.nextLine();
        double salary = scanner.nextDouble();

        
        Employee employee = new Employee();

        
        employee.setDetails(name, salary);
        employee.displayDetails();

        scanner.close();
    }
}
