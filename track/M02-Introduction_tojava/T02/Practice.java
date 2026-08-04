public class Practice {
    public static void main(String[] args) {
        int num=25;
        int firstScore=15;
        int secondScore=25;
        if (num > 0){
            System.out.println("Number type: positive");

        } else if (num < 0){
            System.out.println("Number type: Negative");

        } else{
            System.out.println("Number is :Zero");
        }

        if (num % 2 == 0){
            System.out.println("Parity: Even");

        } else {
            System.out.println("Parity: Odd");
        }

        if (firstScore >= secondScore) {
            System.out.println("Larger value: " + firstScore);
        } else {
            System.out.println("Larger value: " + secondScore);
        }

    }
    
}
