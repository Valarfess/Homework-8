package academy.belhard;

import java.util.Comparator;

public class Address implements Comparator {
    private String city;
    private String street;
    private int houseNumber;

    public Address(String city, String street, int houseNumber) {
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public String getCity() {return city;}
    public String getStreet() {return street;}
    public int getHouseNumber() {return houseNumber;}

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
