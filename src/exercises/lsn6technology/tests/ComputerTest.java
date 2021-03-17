package exercises.lsn6technology.tests;

import exercises.lsn6technology.Laptop;
import exercises.lsn6technology.SmartPhone;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComputerTest {
    static Laptop laptop1;
    static Laptop laptop2;
    static Laptop laptop3;
    static Laptop laptop4;
    static Laptop laptop5;

    static SmartPhone smartPhone1;
    static SmartPhone smartPhone2;

    @BeforeClass
    public static void createLaptops() {
        laptop1 = new Laptop("Work laptop", "Dell", 1000, true);
        smartPhone1 = new SmartPhone("Personal cell", "Samsung", false);
        laptop2 = new Laptop("Gaming laptop", "Alienware", 2500, false);
        laptop3 = new Laptop("Laptop 3", "Lenovo", 2500, false);
        laptop4 = new Laptop("Laptop 4", "IBM", 2500, false);
        laptop5 = new Laptop("Laptop 5", "Acer", 2500, false);
        smartPhone2 = new SmartPhone("Work cell", "Google", true);
    }

    @Test
    public void constructorsTest() {
        assertEquals(1, laptop1.getId());
        assertEquals("Work laptop", laptop1.getName());
        assertEquals("Dell", laptop1.getBrand());
        assertEquals(1000, laptop1.getHardDriveSize(), .001);
        assertTrue(laptop1.isTouchScreen());
        assertFalse(laptop1.isOn());
        assertFalse(laptop1.isOpen());

        assertEquals(2, smartPhone1.getId());
        assertEquals("Personal cell", smartPhone1.getName());
        assertEquals("Samsung", smartPhone1.getBrand());
        assertFalse(smartPhone1.isFingerprintReader());
        assertTrue(smartPhone1.isPortraitMode());
        assertFalse(smartPhone1.isOn());

        assertEquals(3, laptop2.getId());
        assertEquals("Gaming laptop", laptop2.getName());
        assertEquals("Alienware", laptop2.getBrand());
        assertEquals(2500, laptop2.getHardDriveSize(), .001);
        assertFalse(laptop2.isTouchScreen());
        assertFalse(laptop2.getBrand(),laptop2.isOn());
        assertFalse(laptop2.isOpen());
    }

    @Test
    public void openLapTopTest() {
        laptop5.openLaptop();
        assertTrue(laptop5.isOpen());
    }

    @Test
    public void openLapTopAlreadyOpenTest() {
        laptop3.openLaptop();
        laptop3.openLaptop();
        assertTrue(laptop3.isOpen());
    }

    @Test
    public void pressPowerButtonTest() {
        laptop4.openLaptop();
        laptop4.pressPowerButton();
        assertTrue(laptop4.isOn());
        laptop4.pressPowerButton();
        assertFalse(laptop4.isOn());
    }

    @Test
    public void changeToLandscapeMode() {
        smartPhone2.changeToLandscapeMode();
        assertFalse(smartPhone2.isPortraitMode());
    }
}
