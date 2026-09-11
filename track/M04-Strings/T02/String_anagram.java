import java.util.*;
public class String_anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s1=sc.next();
        String s2=sc.next();

        if (s1.length()!=s2.length()){
            System.out.println("not anagram");
            return;
        }

        char[] arr1=s1.toCharArray();
        char[] arr2=s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String s3=new String(arr1);
        String s4=new String(arr2);

        if (s3.equals(s4)){
            System.out.println("anagram");
        } else {
            System.out.println("not anagram");
        }


    }
}
