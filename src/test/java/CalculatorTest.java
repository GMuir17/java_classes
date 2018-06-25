import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator(5, 2);
    }

    @Test
    public void hasFirstNumber() {
        assertEquals(5, calculator.firstNumber());
    }

}
