public class StudentHire {
    String name;

    void setName(String name) {
        this.name = name;
    }

    void showName() {
        System.out.println("Student Name: " + this.name);
    }

    void showScore(int first) {
        System.out.println("First Score: " + first);
    }

    void showScore(int first, int second) {
        int total = first + second;
        
        System.out.println("Two-Score Total: " + total);
    }

}
