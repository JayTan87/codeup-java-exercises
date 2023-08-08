import java.util.Arrays;

public class ArraysExercises {
    public static Person[] addPerson(Person[] people, Person personToAdd) {

        Person[] newPeople = Arrays.copyOf(people, people.length + 1);
        newPeople[newPeople.length - 1] = personToAdd;
        for(int i = 0; i < 4; i++) {
            System.out.println(newPeople[i].getName());
        }
        return newPeople;
    }
    public static void main(String[] args) {

        Person[] people = {new Person("Jeremy"), new Person("Bob"), new Person("Bill")};
        addPerson(people, new Person("Mary"));
//
    }

}
