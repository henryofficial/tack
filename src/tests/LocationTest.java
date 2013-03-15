package tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import tack.Location;

/**
 * JUnit tests for tack.Location class.
 */
public class LocationTest {

    public LocationTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /* ----- TESTS ----- */

    @Test
    public void testTest() {
        assertTrue(true);
    }

    /* ----- RUN TESTS ----- */

    public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("tests.LocationTest");
    }
}