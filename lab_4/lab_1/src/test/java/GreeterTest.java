import org.junit.Assert;
import org.junit.Test;

public class GreeterTest {

    @Test
    public void greeterGreetsCorrect() {
        Assert.assertTrue("Hello, World!".equalsIgnoreCase(new Greeter().greet()));
    }
}
