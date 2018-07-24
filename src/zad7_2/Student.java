package zad7_2;

public class Student extends Person{
    private String klasa;

    public Student(String firstName, String lastName, String klasa) {
        super(firstName, lastName);
        this.klasa = klasa;
    }

    public String getKlasa() {
        return klasa;
    }

    public void setKlasa(String klasa) {
        this.klasa = klasa;
    }

    @Override
    public void show() {
        super.show();
        System.out.println(klasa);
    }
}
