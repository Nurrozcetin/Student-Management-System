public class App {
    public static void main(String[] args) throws Exception {
        student s1 = new student();
        s1.enroll();
        s1.pay();
        System.out.println(s1.showInfo());
    }
}
