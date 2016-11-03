package hu.bme.msc.agiletool.tests.logic;

import hu.bme.msc.agiletool.logic.SomeLogic;
import org.junit.Assert;
import org.junit.Test;

public class SomeLogicTest {

    @Test
    public void testMultiply() {
        SomeLogic someLogic = new SomeLogic(2, 5);

        Assert.assertEquals(someLogic.multiply(), 10);
    }
}
