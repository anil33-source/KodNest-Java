public class String_basic4 {
    public static void main(String[] args) {
        String s1="java";
        String s2="jaVa";

        if (s1.equalsIgnoreCase(s2)){
            System.out.println("ref are equal");
        } else {
            System.out.println("ref are not equal");
        }
    }
}
