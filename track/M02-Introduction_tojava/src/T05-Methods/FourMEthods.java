import java.util.Scanner;
public class FourMEthods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MethodDemo d1 = new MethodDemo();
        String name = scanner.nextLine();
        int first =scanner.nextInt();
        int second = scanner.nextInt();
        // Read the name and two numbers
        // Create one object
        // Call all four methods
        d1.sayHello();
        d1.greet(name);
        int res = d1.getLuckyNumber();
        int sum = d1.add(first,second);
        System.out.println("Lucky Number: " + res);
        System.out.println("Sum: " + sum);
        scanner.close();

    }
}
