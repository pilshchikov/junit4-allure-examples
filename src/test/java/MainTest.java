import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;

@Slf4j
public class MainTest {

    /**
     * Javadoc
     */
    @Test
    public void failedTest() {
        assertTrue(false);
    }

    @Test
    public void ignoreTest() {
        assertTrue(false);
    }

    @Test
    public void assumeTest() {
        assumeTrue(false);
    }

    @Test
    public void simpleTest() {
        log.info("Yeah!");
    }

    @Test
    public void errorTest() {
        throw new Error("Error");
    }
}