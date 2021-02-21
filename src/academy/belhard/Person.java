package academy.belhard;
import academy.belhard.*;

import java.util.Comparator;

public class Person{
    public String firstName;
    public String lastName;
    public Address address;

    public Person(String firstName, String lastName, Address address) {
        this.address = address;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        if (address != null)
        return  "\n" + "Person: " +
                "FirstName - " + firstName + ", " +
                "LastName - " + lastName  +
                "Location info: " + address.getCity() + ", ul." + address.getStreet() + ", #" + address.getHouseNumber() +
                '.';
        else return ("\n" + "Person: " +
                "FirstName - " + firstName + ", " +
                "LastName - " + lastName + ", Location info: empty.");
    }

}
