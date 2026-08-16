import java.util.Scanner;
public class VariableShadowing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the name
        String name = scanner.nextLine();

        // Create one Student object
        Stud student = new Stud();

        // Call setName() and displayName()
        student.setName(name);
        student.displayName();

        scanner.close();
    }
}
