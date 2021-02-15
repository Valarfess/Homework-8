package academy.belhard;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Minsk","Odoevskogo",83,"Mikhail", "Potapich");
	    Person person2 = new Person("Minsk","Matusevicha", 54,"Sasha", "Checatilo");
	    Person person3 = new Person("Minsk","Pushkina", 13, "Vova", "Dubolom");
        System.out.println(person1.toString() + person2.toString() + person3.toString());
        // write your code here
    }
}
