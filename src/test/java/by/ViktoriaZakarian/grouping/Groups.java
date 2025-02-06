package by.ViktoriaZakarian.grouping;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class Groups {

    @Test(groups = {"first"})
    public void one() {
        assertTrue(true);
    }

    @Test(groups = {"second"})
    public void two() {
        assertTrue(true);
    }

    @Test(groups = {"first"}, dependsOnMethods = "one")
    public void three() {
        assertTrue(true);
    }

    @Test(groups = {"second"}, dependsOnMethods = "two")
    public void four() {
        assertTrue(true);
    }

    @Test(groups = {"first"}, dependsOnMethods = "three")
    public void five() {
        assertTrue(true);
    }

    @Test(groups = {"second"}, dependsOnMethods = "four")
    public void six() {
        assertTrue(true);
    }

    @Test(groups = {"first"}, dependsOnMethods = "five")
    public void seven() {
        assertTrue(true);
    }

    @Test(groups = {"second"}, dependsOnMethods = "six")
    public void eight() {
        assertTrue(true);
    }
}
