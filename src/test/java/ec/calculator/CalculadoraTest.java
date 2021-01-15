package ec.calculator;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void give_one_numner_when_add_ok(){
        Calculadora calculator = new Calculadora();
        Assert.assertEquals(8, calculator.sumar(3, 5));

    }
}