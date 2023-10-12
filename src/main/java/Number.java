public class Number implements Node{

    private int value;

    public Number(int value) {
        this.value = value;
    }

    @Override
    public int evaluate() {
        return value;
    }

    @Override
    public String stringExpression() {

        return value + "";
    }
}
