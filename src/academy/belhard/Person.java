package academy.belhard;
import academy.belhard.*;

import java.util.Comparator;

public class Person implements Comparator{
    public String firstName;
    public String lastName;
    public Address address;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }

    public Person(String firstName, String lastName, Address address) {
        this.address = address;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        if (address != null)
        return "Person: " + '\n' +
                "FirstName - " + firstName + ", " +
                "LastName - " + lastName + '\n' +
                "Location info: " + address.getCity() + ", ul." + address.getStreet() + ", #" + address.getHouseNumber() +
                '.' + '\n';
        else return ("address not exist");
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }


//    @Override
//    public int compare(Person o1, Person o2) {
//        return 0;
//    }
}
