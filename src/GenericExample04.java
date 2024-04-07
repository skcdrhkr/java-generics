import multibound.HasId;
import multibound.HasName;
import multibound.Product;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GenericExample04 {
    public static void main(String[] args) {
        var products = List.of(new Product(15001L, "cheese", "tasty"),
                new Product(14002L, "bread", "nottasty"),
                new Product(15032L, "item", "anything"));


        System.out.println(GenericExample04.sortByIDAndExtractNames(products));
    }

     static <T extends HasId & HasName> List<String> sortByIDAndExtractNames(List<T> products) {
        return products.stream().sorted(Comparator.comparing(HasId::id)).map(HasName::name).collect(Collectors.toList());
    }
}
