public class P4 {
    public static void main(String[] args) {
        // write your code here
        double Principle=10000.0;
        double rate=6.5;
        double time=2.0;
        double weight=72.0;
        double height=1.8;
        int sub1=78;
        int sub2=84;
        int sub3=69;
        int sub4=91;
        int sub5=88;
        int total=500;

        int totalMarks=sub1+sub2+sub3+sub4+sub5;

        double simpleIntrest=(Principle*time*rate)/100;

        double totalAmount=simpleIntrest+Principle;

        double bmi=weight/(height * height);
        double percentage=(totalMarks*100.0)/total;

        System.out.println("Simple Interest: " + simpleIntrest);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("BMI: " + bmi);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage);

        
    }
}
