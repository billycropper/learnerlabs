package learner;

public class Main {
    public static void main(String[] args) {
        People people = new People();

        people.add(new Person(123, "Billy"));
        System.out.println(people.personList);
    }
}
