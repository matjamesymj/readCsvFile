package uk.co.allwebwork;

import junit.framework.TestCase;

public class CarTest extends TestCase {
    public void testTestSuperMethod() throws Exception {
        Car car = new Car();
        assertEquals(car.exampleSuperMethod(),"Override by Car sub class");
    }

}