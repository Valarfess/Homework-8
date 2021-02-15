package academy.belhard;
import academy.belhard.*;

public class Person extends Address{
    public String firstName;
    public String lastName;

    public Person(String city, String street, int houseNumber,String firstName,String lastName) {
        super(city, street, houseNumber);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person: " + '\n' +
                "FirstName - " + firstName + ", " +
                "LastName - " + lastName + '\n' +
                "Location info: " + getCity() +", ul."+ getStreet()+", #"+ getHouseNumber() +
                '.' + '\n';
    }
}
