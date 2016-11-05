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

    @Test
    public void testAddition() {
        SomeLogic someLogic = new SomeLogic(2, 5);

        Assert.assertEquals(someLogic.addition(), 7);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivision() {
        SomeLogic someLogic = new SomeLogic(2, 0);

        someLogic.division();
    }

    @Test
    public void testAddition2() {
        SomeLogic someLogic = new SomeLogic(5, 5);

        Assert.assertEquals(someLogic.addition(), 10);
    }

    @Test
    public void testAddition3() {
        SomeLogic someLogic = new SomeLogic(5, 5);

        Assert.assertEquals(someLogic.addition(), 10);
    }

    @Test
    public void testAddition4() {
        SomeLogic someLogic = new SomeLogic(5, 5);

        Assert.assertEquals(someLogic.addition(), 10);
    }

    @Test
    public void testAddition5() {
        SomeLogic someLogic = new SomeLogic(5, 5);

        Assert.assertEquals(someLogic.addition(), 10);
    }

    @Test
    public void testAddition6() {
        SomeLogic someLogic = new SomeLogic(5, 5);

        Assert.assertEquals(someLogic.addition(), 10);
    }

    @Test
    public void testAddition7() {
        SomeLogic someLogic = new SomeLogic(5, 5);

        Assert.assertEquals(someLogic.addition(), 10);
    }

    @Test
    public void testAddition8() {
        SomeLogic someLogic = new SomeLogic(5, 5);

        Assert.assertEquals(someLogic.addition(), 10);
    }

    @Test
    public void testAddition9() {
        SomeLogic someLogic = new SomeLogic(5, 5);

        Assert.assertEquals(someLogic.addition(), 10);
    }
}
