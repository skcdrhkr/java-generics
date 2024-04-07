import tree.InnerNode;
import tree.LeafNode;

public class GenericsExample01 {
    public static void main(String[] args) {
        var three = new LeafNode<Integer>(3);
        var five = new LeafNode<>(5);
        var tree = new InnerNode<>(new LeafNode<>(6), new InnerNode<Integer>(three, five));

        System.out.println(tree);
    }
}
