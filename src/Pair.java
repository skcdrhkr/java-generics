import java.util.function.BiFunction;
import java.util.function.Function;

public record Pair<K, V>(K key, V value) {

    public static <T, W> Pair<T, W> of(T key, W value) {
        return new Pair<>(key, value);
    }

    public Pair<K, V> withFirst(K newFirst) {
        return Pair.of(newFirst, value);
    }

    public Pair<K, V> withSecond(V newSecond) {
        return Pair.of(key, newSecond);
    }

    public <T, W> Pair<T, W> map(BiFunction<K, V, Pair<T, W>> fn) {
        return fn.apply(key, value);
    }

    public <T> Pair<K, T> mapValue(Function<V, T> fn) {
        return Pair.of(key, fn.apply(value));
    }
}
