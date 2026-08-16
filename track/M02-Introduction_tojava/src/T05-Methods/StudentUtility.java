public class StudentUtility {
     void showReportTitle() {
        System.out.println("Student Performance Report");
    }

    void displayStudent(int id, String name) {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    float getPassingPercentage() {
        return 60.0f;
    }

    float calculatePercentage(int javaScore, int sqlScore) {
        return (float) (javaScore + sqlScore) / 2;
    }
}
