import java.util.ArrayList;
import java.util.List;

public class GenericExample06 {
    public static void main(String[] args) {
        List dogs = new ArrayList<>();
        dogs.add(new Dog("Max"));
        dogs.add(new Dog("Lucas"));

        List<Cat> cats = dogs; // Allowed;
        System.out.println(cats);
        // Cat cat = cats.get(0); // Class cast exception

        List<? extends Animal> animals = dogs;
        List<Dog> dogsAgain = (List<Dog>) animals; // Casting to a non-reifiable type "unchecked" warning
        List<Cat> cats2 = (List<Cat>) animals; // "unchecked" warning and heap pollution
        Cat cat = cats2.get(0); // Class cast exception
    }
}