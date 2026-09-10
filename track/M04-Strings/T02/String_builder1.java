public class String_builder1 {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder();

        System.out.println(str.capacity());
        System.out.println(str.length());
        
        str.append("java");
        System.out.println(str);
        System.out.println(str.capacity());
        System.out.println(str.length());
        
        str.append("programming language");
        System.out.println(str.capacity());
        
        System.out.println(str.length());
        System.out.println(str);


    }
}
