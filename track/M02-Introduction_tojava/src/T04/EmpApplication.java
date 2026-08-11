public class EmpApplication {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.id=11;
        e1.name="koti";

        System.out.println(e1.id);
        System.out.println(e1.name);
        e1.work();
    }
}
