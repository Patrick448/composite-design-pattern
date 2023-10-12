import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberTest {

    @Test
    void deveRetornarResultado(){
        Node expr = new Number(10);
        assertEquals(10, expr.evaluate());
    }

    @Test
    void deveRetornarExpressaoSoma(){
        Node expr = new Number(10);
        assertEquals("10", expr.stringExpression());
    }

}