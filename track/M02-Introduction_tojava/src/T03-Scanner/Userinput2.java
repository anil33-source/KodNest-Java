package T03;
import java.util.Scanner;
public class Userinput2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        System.out.println("Your age is: " + age);

        System.out.println("Enter your height:");
        float height=sc.nextFloat();
        System.out.println("your height is: " + height);
        sc.nextLine();
        System.out.println("Enter your Full name: ");
        String name=sc.nextLine();
        System.out.println("Your full name is: " + name);
        sc.close();

    }
}
