package lzc.com.actionbar;

import org.junit.Test;

import lzc.com.java.DecimalHelper;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
       // System.out.println(DecimalHelper.doubleReserve(3.1415926535,4));
        System.out.println(DecimalHelper.floatKeep(3.1415926535,4));
    }
}