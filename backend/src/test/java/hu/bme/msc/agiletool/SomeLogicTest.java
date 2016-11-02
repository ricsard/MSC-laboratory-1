package hu.bme.msc.agiletool;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Ricsard on 2016. 11. 02..
 */
public class SomeLogicTest {

    @Test
    public void testMultiply() {
        SomeLogic someLogic = new SomeLogic(2, 5);
        Assert.assertEquals(someLogic.multiply(), 10);
    }
}
