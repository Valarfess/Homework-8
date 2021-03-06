package academy.belhard;

import java.util.*;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Address address1 = new Address("Minsk", "Matusevicha", 71);
        Address address2 = new Address("Minsk", "Odoevskogo", 54);
        Address address3 = new Address("Minsk","Pushkina", 37);
        Address address4 = new Address("Osipovichi", "Sovetskaya", 33);
        Address address5 = new Address("Petrikov","Oleshkina", 21);

        Person person1 = new Person("Vasia", "Pupkin", address1);
	    Person person2 = new Person("Okama","Dubolom", address2);
	    Person person3 = new Person("Lilu","Skazkina", address3);
	    Person person4 = new Person(null,"Slivkin", address4);
	    Person person5 = new Person("Lucky",null, address5);
	    Person person6 = new Person("Vanya","Barashkin", null);

        ArrayList<Person> personClub = new ArrayList<>();
            personClub.add(person1);
            personClub.add(person2);
            personClub.add(person3);
            personClub.add(person4);
            personClub.add(person5);
            personClub.add(person6);

        personClub.forEach(System.out::print);
        System.out.println();

            List <String> result = personClub
                .stream()
                .filter(x -> x.getFirstName() != null && x.getLastName() != null && x.getAddress() != null)
                .sorted(Comparator.comparingInt(s -> s.getAddress().getHouseNumber()))
                .map(Person::toString)
                .collect(Collectors.toList());

        result.forEach(System.out::print);



        // write your code here
    }
}
