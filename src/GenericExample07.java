public class GenericExample07 {
    public static void main(String[] args) {
        // Entry<Integer, String>[] pairs;
        // pairs = new Entry<Integer, String>[10]; // Generic array creation
        Dog[] dogs = new Dog[2];
        dogs[0] = new Dog("Max");
        dogs[1] = new Dog("Lucas");

        Animal[] animals = dogs; // OK because arrays are covariant: Dog[] is a subtype of Animal[]
        animals[0] = new Cat("Suzzy"); // ArrayStoreException
        Dog suzzy = dogs[0];

    }

    static <T> T[] createArray(int size) {
        // return new T[size]; // generic array creationo
        return null;
    }
}

record Entry<T, U>(T first, U second) {
};