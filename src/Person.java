import java.util.Scanner;

class Person {
    private String name;
    public Person() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a name.");
        name = scanner.nextLine();
    }
    public Person(String passedName) {
        name = passedName;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String newName)   {
        name = newName;
    }
    public void sayHello() {
        System.out.println("Hello " + name + "!");
    }

    public static void main(String[] args) {
//        Person bob = new Person();
//        bob.sayHello();
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());

    }
}
