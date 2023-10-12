public class AbstractSyntaxTree {
    private Node root;

    public AbstractSyntaxTree(Node root) {
        this.root = root;
    }

    public int evaluate() {
        return root.evaluate();
    }

    public String asString() {
        return root.stringExpression();
    }
}
