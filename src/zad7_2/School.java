package zad7_2;

public class School {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Jan", "Kowalski", 3500);
        Student student = new Student("Anna", "Nowak", "3a");

        teacher.show();
        student.show();
    }


}
