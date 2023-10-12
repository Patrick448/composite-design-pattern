public class Division implements Node{

    private Node left;
    private Node right;

    public Division(Node left, Node right) {
        this.left = left;
        this.right = right;
    }
    @Override
    public int evaluate() {
        return left.evaluate() / right.evaluate();
    }

    @Override
    public String stringExpression() {
        return "(" + left.stringExpression() + " / " + right.stringExpression() + ")";
    }
}
