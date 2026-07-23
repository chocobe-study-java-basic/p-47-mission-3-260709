package testUtil;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ConsoleOutputTestUtilTest {

    private ConsoleOutputTestUtil testUtil;

    @BeforeEach
    void setUp() {
        this.testUtil = new ConsoleOutputTestUtil();
    }

    @AfterEach
    void tearDown() {
        this.testUtil.tearDown();
    }

    @Test
    @DisplayName("콘솔 출력값 테스트1\\n")
    void t1() {
        System.out.println("콘솔 출력값 테스트1");
        String result = this.testUtil.getOutputString();

        Assertions.assertThat(result).isEqualTo("콘솔 출력값 테스트1\n");
    }

    @Test
    @DisplayName("ABC !@#")
    void t2() {
        System.out.println("ABC !@#");
        String result = this.testUtil.getOutputString();

        assertThat(result).isEqualTo("ABC !@#\n");
    }
}
