package ClassPerson;

import lombok.NoArgsConstructor;


@NoArgsConstructor
public class Person {
    private String firstName;
    private String surname;
    private String street;
    private int zipCode;
    private String city;


    public void initialize(String firstName, String surname, String street, String city, int zipCode) {
        this.city = city;
        this.firstName = firstName;
        this.street = street;
        this.zipCode = zipCode;
        this.surname = surname;
    }

    public void print() {
        System.out.println("First name : " + this.firstName + ", "+
                            "Surname : " + this.surname +", "+
                            "City : " + this.city +", "+
                            "Street : " + this.street +", "+
                            "Zip Code : " + this.zipCode
        );
    }
}
