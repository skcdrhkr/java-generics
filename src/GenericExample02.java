public class GenericExample02 {
    public static void main(String[] args) {
        var pair = Pair.<Integer, String>of(3, "name");
        System.out.println(pair.withSecond("idle").value());

        var pair2 = Pair.of(5, "id");
        System.out.println(pair2.withFirst(12).key());

        var pair3 = Pair.<Integer, String>of(45, "man").<String, Integer>map((Integer x, String y) -> Pair.<String, Integer>of(y, x));
        System.out.println(pair3.key());

        var pair4 = pair2.mapValue(String::toUpperCase);
        System.out.println(pair4.value());
        System.out.println(pair4.key());
    }
}
