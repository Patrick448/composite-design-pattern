import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {

    @Test
    void deveRetornarResultadoSoma(){
        Node expr = new Division(new Number(3), new Number(3));
        assertEquals(1, expr.evaluate());
    }

    @Test
    void deveRetornarExpressaoSoma(){
        Node expr = new Division(new Number(6), new Number(3));
        assertEquals("(6 / 3)", expr.stringExpression());
    }

}