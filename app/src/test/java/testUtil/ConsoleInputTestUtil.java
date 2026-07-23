package testUtil;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class ConsoleInputTestUtil {

    private InputStream originIn;
    private Scanner sc;

    public ConsoleInputTestUtil() {
        this.setUp();
    }

    private void setUp() {
        this.originIn = System.in;
    }

    public void tearDown() {
        System.setIn(originIn);
    }

    public Scanner input(String value) {
        ByteArrayInputStream inputStream = new ByteArrayInputStream(value.getBytes());
        System.setIn(inputStream);
        this.sc = new Scanner(System.in);

        return this.sc;
    }

}
