import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbstractSyntaxTreeTest {

    @Test
    void deveRetornarResultado(){
        Node expr = new Addition(new Number(2), new Number(3));
        Node expr2 = new Multiplication(expr, new Number(10));
        Node expr3 = new Division(expr2, new Number(2));
        Node expr4 = new Subtraction(expr3, new Number(5));
        AbstractSyntaxTree ast = new AbstractSyntaxTree(expr4);
        assertEquals(20, ast.evaluate());
    }

    @Test
    void deveRetornarExpressao(){
        Node expr = new Addition(new Number(2), new Number(3));
        Node expr2 = new Multiplication(expr, new Number(10));
        Node expr3 = new Division(expr2, new Number(2));
        Node expr4 = new Subtraction(expr3, new Number(5));
        AbstractSyntaxTree ast = new AbstractSyntaxTree(expr4);

        assertEquals("((((2 + 3) * 10) / 2) - 5)", ast.asString());
    }

}