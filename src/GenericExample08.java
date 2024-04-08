import java.util.HashMap;
import java.util.Map;

public class GenericExample08 {

    static void printLines(String... lines) {
        for (String line : lines) {
            System.out.println(line);
        }
    }

    @SafeVarargs // Causes unchecked warning disappears
    static <T, U> void printToMap(Map<? super T, ? super U> map, Pair<? extends T, ? extends U>... pairs) { // pairs is array of non-reifiable type
        for (var pair : pairs) {
            map.put(pair.key(), pair.value());
        }
        Object[] array = pairs; // This is allowed due to aray being covariant
        array[0] = new Pair<Long, Long>(2L, 3L); // the array store check will not be able to check this type - Heap pollution
    }

    public static void main(String[] args) {
        printLines("Hello World", "How are you", "Maybe good");

        var map = new HashMap<Integer, String>();
        printToMap(map, new Pair<>(1, "one"), new Pair<>(2, "two")); // This is creating Pair<Integer,String> array which is array of non-reifiable type , hence generic array creation warning
    }
}
