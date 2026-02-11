public class Student {
    String name;
    static String Collage;

    static {
        Collage = "Alard Collage";

        }
        Student(String name) {
        this.name =name;

    }
    static void showCollage() {
        System.out.println("Collage:" + Collage);
    }
    public void showName() {
        System.out.println("Student: " + name );

    }
    public static void main(String[] args){
        Student s1 = new Student ("omkant");
        Student s2 = new Student ("giri");
        s1.showName();
        s2.showName();
        Student.showCollage();
    }
}
