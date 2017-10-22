import SortingMethodsUsage.Program;
import org.junit.Test;

public class SortingMethodsUsageTest {
    @Test
    public void parseEmptyArguments() {
        Program.parseArguments(new String[] {});
    }

    @Test
    public void parseOneArgument() {
        Program.parseArguments(new String[] {"100"});
    }

    @Test(expected = IllegalArgumentException.class)
    public void parseMoreThanOneArgument() {
        Program.parseArguments(new String[] {"100", "200"});
    }

    @Test(expected = NumberFormatException.class)
    public void parseBadArgument() {
        Program.parseArguments(new String[] {"das"});
    }

    @Test
    public void callMainWithOneArgument() {
        Program.main(new String[] {"1000"});
    }

    @Test
    public void callMainWithBadArg() {
        Program.main(new String[] {"test"});
    }

    @Test
    public void callMainWithNegArg() {
        Program.main(new String[] {"-1"});
    }

    @Test
    public void callMainWithTwoArgs() {
        Program.main(new String[] {"11", "111"});
    }
}
