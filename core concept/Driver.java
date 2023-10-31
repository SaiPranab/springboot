public class Driver {
    public static void main(String[] args) {
        var student1 = new Student(101, "smruti");
        var student2 = new Student(102, "banty");
        var student3 = new Student(103, "gulu");

        System.out.println("Name: " + student1.name());
        System.out.println("Roll: " + student1.roll());
        System.out.println(student2);
    }
}
