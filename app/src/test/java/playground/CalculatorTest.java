package playground;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    @DisplayName("Calc.sum(1, 2) == 3")
    void t1() {
        int result = Calculator.sum(1, 2);
        assertThat(result).isEqualTo(3);
    }

    @Test
    @DisplayName("Calculator.sub(1, 2) == -1")
    void t2() {
        int result = Calculator.sub(1, 2);
        assertThat(result).isEqualTo(-1);
    }

}