import java.util.Scanner;

public class ArrayMin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[5];
        System.out.println("Enter elemts");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Array is");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int min=a[0];
        for (int i=1;i<a.length;i++){
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println("Min: " + min);

    }
}
