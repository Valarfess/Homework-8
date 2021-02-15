package academy.belhard;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Alesha", "Pupkin", new Address("Minsk", "Matusevicha", 83));
	    Person person2 = new Person("Okama","Oznobihin", new Address("Minsk", "Odoevskogo", 54));
	    Person person3 = new Person("Lilu","Skazkina", new Address("Minsk", "Fedorova", 18));
        System.out.println(person1.toString() + person2.toString() + person3.toString());
        // write your code here
    }
}
