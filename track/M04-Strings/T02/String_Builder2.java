public class String_Builder2 {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("java");

        str.ensureCapacity(100);

        System.out.println(str.capacity());
        System.out.println(str.length());
        
        System.out.println(str);
        
        str.append("is a programming language");
        
        System.out.println(str.capacity());
        System.out.println(str.length());

    }
}
