import com.will.MiddleThree;
import org.junit.Test;
import static junit.framework.TestCase.*;

public class MiddleThreeTest {

    @Test
    public void MiddleThreeWorks() throws Exception {
        String expectedOutput = "and";
        assertEquals(expectedOutput, MiddleThree.middleThree("Candy"));
        System.out.println(MiddleThree.middleThree("Candy"));
    }

}
