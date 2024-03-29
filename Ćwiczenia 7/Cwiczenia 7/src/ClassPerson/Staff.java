package ClassPerson;

public class Staff extends Person{

    private String education;
    private String position;

    public void initialize1(String firstName, String surname, String street, String city, int zipCode, String education, String position) {
        super.initialize(firstName, surname, street, city, zipCode);
        this.position = position;
        this.education = education;
    }

    public void print1() {
        super.print();
        System.out.print("Education : " + this.education + ", " + "Position : " + this.position );
    }
}
