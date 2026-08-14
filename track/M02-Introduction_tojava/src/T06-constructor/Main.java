class Student5 {
    String name;
    int age;
    double height;

    Student5(String name,int age,double height){
        this.name=name;
        this.age=age;
        this.height=height;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}

public class Main {
    public static void main(String[] args){
        Student5 s1=new Student5("Anil",22,5.5);

        s1.display();
        



    }
}
