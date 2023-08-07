import java.util.Arrays;

public class ArraysExercises {
    public static Person[] addPerson(Person[] people) {

        Person[] newPeople = Arrays.copyOf(people, 4);
        newPeople[3] = new Person("Mary");
        for(int i = 0; i < 4; i++) {
            System.out.println(newPeople[i].getName());
        }
        return newPeople;
    }
    public static void main(String[] args) {

        Person[] people = {new Person("Jeremy"), new Person("Bob"), new Person("Bill")};
        addPerson(people);
//        System.out.println(newPeople[0].getName());
//        for (Person person : people){
//            System.out.println(this.getName());
//        }
    }

}
