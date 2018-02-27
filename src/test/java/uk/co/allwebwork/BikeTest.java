package uk.co.allwebwork;

import junit.framework.TestCase;

public class BikeTest extends TestCase {
    public void testTestSuperMethod() throws Exception {
        Bike bike = new Bike();
        assertEquals(bike.exampleSuperMethod(),"Super vehicle");
    }

}