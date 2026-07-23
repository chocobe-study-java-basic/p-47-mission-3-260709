package testUtil;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ConsoleOutputTestUtil {

    private PrintStream originOut;
    private ByteArrayOutputStream outputStream;
    private PrintStream printStream;

    public ConsoleOutputTestUtil() {
        this.setUp();
    }

    private void setUp() {
        this.originOut = System.out;

        this.outputStream = new ByteArrayOutputStream();
        this.printStream = new PrintStream(this.outputStream);
        System.setOut(printStream);
    }

    public void tearDown() {
        System.setOut(this.originOut);
        this.printStream.close();
    }

    public String getOutputString() {
        return this.outputStream.toString();
    }

}
