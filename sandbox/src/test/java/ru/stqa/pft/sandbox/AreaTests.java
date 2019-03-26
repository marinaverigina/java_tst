package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AreaTests {

    @Test
    public void testSquareArea(){
        Square s = new Square(5);
        Assert.assertEquals(s.area(),25.0);

    }

    @Test
    public void testRectangleArea() {
        Rectangle r = new Rectangle(3,5);
        Assert.assertEquals(r.area(),15);
    }
}
