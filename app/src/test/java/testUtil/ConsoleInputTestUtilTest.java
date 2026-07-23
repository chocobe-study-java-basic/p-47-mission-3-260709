package testUtil;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class ConsoleInputTestUtilTest {

    private ConsoleInputTestUtil testUtil;

    @BeforeEach
    void setUp() {
        this.testUtil = new ConsoleInputTestUtil();
    }

    @AfterEach
    void tearDown() {
        this.testUtil.tearDown();
    }

    @Test
    @DisplayName("콘솔 입력값 테스트입니다.")
    void t1() {
        Scanner sc = this.testUtil.input("콘솔 입력값 테스트입니다.");
        String result = sc.nextLine();

        assertThat(result).isEqualTo("콘솔 입력값 테스트입니다.");
    }

    @Test
    @DisplayName("DEF $%^")
    void t2() {
        Scanner sc = this.testUtil.input("DEF $%^");
        String result = sc.nextLine();

        assertThat(result).isEqualTo("DEF $%^");
    }

}
