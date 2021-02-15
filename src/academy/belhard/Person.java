package academy.belhard;
import academy.belhard.*;

public class Person{
    public String firstName;
    public String lastName;
    public Address address;



    public Person(String firstName,String lastName, Address address) {
        this.address = address;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person: " + '\n' +
                "FirstName - " + firstName + ", " +
                "LastName - " + lastName + '\n' +
                "Location info: " + address.getCity() + address.getStreet() + address.getHouseNumber() +
                '.' + '\n';
    }


}
