package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMain {
    @Test
    public void testCalcPlus() {
        Calculator calc = Calculator.instance.get();

        // given:
        final Integer x = 3;
        final Integer y = 4;
        final Integer original = 7;

        // when:
        Integer result = calc.plus.apply(x, y);

        // then:
        Assertions.assertEquals(original, result);
    }
}
