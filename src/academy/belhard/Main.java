package academy.belhard;

import java.util.*;
import java.util.stream.Collectors;

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

        System.out.println("До сортировки: " + personClub);
        System.out.println("В списке " + personClub.size() + " объектов");

            List <Person> result = personClub
                .stream()
                .filter(x -> x.getFirstName() != null && x.getLastName() != null && x.getAddress() != null)
                .sorted(Comparator.comparingInt(s -> s.getAddress().getHouseNumber()))
                .collect(Collectors.toList());

        System.out.println("\n"+"\n"+"После сортировки: " + "\n" + result);
        System.out.println("В списке " + personClub.size() + " объектов");


        // write your code here
    }
}
