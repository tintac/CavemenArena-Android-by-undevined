package cavemenarena.undevined.com.cavemenarena.test;

import android.test.InstrumentationTestCase;

/**
 * Created by sleephead on 05.03.15.
 */
public class myTest extends InstrumentationTestCase {
    public void test() throws Exception {
        final int expected = 1;
        final int reality = 1;
        assertEquals(expected, reality);
        if(test_asdf())
        throw new Exception("foo");
    }
    private boolean test_asdf(){
        return true;
    }
}
