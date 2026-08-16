import java.util.Scanner;

public class StudentRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create and populate firstStudent
        StudentPro firstStudent = new StudentPro();
        firstStudent.registrationId = scanner.nextInt();
        firstStudent.name = scanner.next();
        firstStudent.attendancePercentage = scanner.nextDouble();

        // Create and populate secondStudent
        StudentPro secondStudent = new StudentPro();
        secondStudent.registrationId = scanner.nextInt();
        secondStudent.name = scanner.next();
        secondStudent.attendancePercentage = scanner.nextDouble();

        // Read the selected ID and new attendance
        int selectedId = scanner.nextInt();
        double newAttendance = scanner.nextDouble();

        StudentPro selectedStudent = null;

        // Make selectedStudent refer to the matching existing object
        if (firstStudent.registrationId == selectedId) {
            selectedStudent = firstStudent;
        } else if (secondStudent.registrationId == selectedId) {
            selectedStudent = secondStudent;
        }

        // Update through selectedStudent when a match exists
        if (selectedStudent != null) {
            System.out.println("Selected Student: " + selectedStudent.name);
            selectedStudent.attendancePercentage = newAttendance;
        } else {
            System.out.println("Student not found.");
        }

        // Display both records
        System.out.println(firstStudent.registrationId + " - " + firstStudent.name + " - " + firstStudent.attendancePercentage + "%");
        System.out.println(secondStudent.registrationId + " - " + secondStudent.name + " - " + secondStudent.attendancePercentage + "%");

        scanner.close();
    }
}
