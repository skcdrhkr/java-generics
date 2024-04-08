import java.util.ArrayList;
import java.util.List;

interface Animal {
}

public class GenericExample05 {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Max"));
        dogs.add(new Dog("Lucy"));

        Animal animal = new Dog("Drago");

        // A List that can contain any kind of object of type Animal
        // List<Animal> animals = dogs; // Error ! Generic types are invariant

        // If generics were covariant
        // meaning If List of Dogs is List of Animals
        // Then compiler would allows us to do
        // Cat cat = new Cat("missy");
        // animals.add(cat);
        // Since Cat is an animal, we should be able to add Cat in list of animals
        // Which is not possible with java, animals is a list of dogs.

        // ----------- WildCards ---------------- //
        // A List of objects of a particular, but unknown type that extends Animal
        // This list can only contain object of that particular type
        List<? extends Animal> animals = dogs; // OK
        // These both don't work because animals is list of Dog type
        // animals.add(new Cat("Suzzy"));
        // animals.add(new Dog("Suzzy"));

    }
}

record Dog(String name) implements Animal {
}

record Cat(String name) implements Animal {
}
