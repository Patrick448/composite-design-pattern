import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTest {

    @Test
    void deveRetornarResultadoSoma(){
        Node expr = new Multiplication(new Number(3), new Number(3));
        assertEquals(9, expr.evaluate());
    }

    @Test
    void deveRetornarExpressaoSoma(){
        Node expr = new Multiplication(new Number(6), new Number(3));
        assertEquals("(6 * 3)", expr.stringExpression());
    }

}