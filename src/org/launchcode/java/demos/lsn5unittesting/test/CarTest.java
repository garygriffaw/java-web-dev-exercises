package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CarTest {

    Car test_Car;

    @Before
    public void createCarObject() {
        test_Car = new Car("Toyota", "Prius", 10, 50);
    }

    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTank() {
        assertEquals(10, test_Car.getGasTankLevel(), .001);
    }

    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void testGasTankLevelAfterDrivingWithinTankRange() {
        test_Car.drive(50);
        assertEquals(9, test_Car.getGasTankLevel(), .001);
    }

    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    @Test
    public void testGasTankLevelAfterDrivingPastTankRange() {
        test_Car.drive(501);
        assertEquals(0, test_Car.getGasTankLevel(), .001);
        assertEquals(500, test_Car.getOdometer(), .001);
    }

    //TODO: can't have more gas than tank size, expect an exception
    @Test(expected = IllegalArgumentException.class)
    public void testGasOverfillException() {
        test_Car.addGas(5);
        fail("Shouldn't get here, car cannot have more gas in tank than the size of the tank");
    }
}
