
public class StudentApplication {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.roll=12;
        s1.name="koti";
        s1.height=5.5;

        System.out.println(s1.roll);
        System.out.println(s1.name);
        System.out.println(s1.height);

        s1.study();

        Student s2=new Student();
        s2.roll=67;
        s2.name="NTR";
        s2.height=5.7;

        System.out.println(s2.roll);
        System.out.println(s2.name);
        System.out.println(s2.height);

        s2.study();
        s2.sleep();
    }   
}
