public class StringMethods {
    public static void main(String[] args) {
        String s="Kodnest Technologies";

        System.out.println(s);
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.charAt(3));
        System.out.println(s.contains("Kod"));
        System.out.println(s.contains("kod"));
        System.out.println(s.startsWith("Kod"));
        System.out.println(s.startsWith("kod"));
        System.out.println(s.endsWith("Ies"));
        System.out.println(s.endsWith("ies"));
        System.out.println(s.indexOf("K"));
        System.out.println(s.indexOf("e"));

        System.out.println(s.replace('e', 'A'));
        System.out.println(s.substring(5,11));
        System.out.println(s.substring(11));

    }
}
