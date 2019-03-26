package calc.point;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DistPointTest {
    @Test
    public void testDistPoint() {
        Point p1 = new Point(3,3);
        Point p2 = new Point(2,2);
        Assert.assertEquals(p1.distance(p2),1.4142135623730951);
    }
}
