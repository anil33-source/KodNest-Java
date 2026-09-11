import java.util.*;
public class String_rev {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.next();

        char arr[]=str.toCharArray();

        char newArr[]=new char[arr.length];

        int j=arr.length-1;

        for(int i=0;i<arr.length;i++){
            newArr[i]=arr[j];
            j--;
        }

        String revStr=new String(newArr);
        System.out.println(str);
        System.out.println(revStr);
    }
}
