import bound.LeafNode;
import bound.MaxValueInnerNode;

public class GenericExample03 {

    public static void main(String[] args) {
        var tree = new MaxValueInnerNode<>(new LeafNode<>(2), new MaxValueInnerNode<>(new LeafNode<>(4), new LeafNode<>(5)));

        System.out.println(tree.getValue());
    }
}
