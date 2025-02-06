package by.ViktoriaZakarian.priority;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Priority1 {

    @Test(priority = 7)
   //2 вариант: @Test(dependsOnMethods = b)
    public void a() {
        assertTrue (true);
    }

    @Test(priority = 6)
    //2 вариант: @Test(dependsOnMethods = c)
    public void b() {
        assertTrue (true);
    }

    @Test(priority = 5)
    //2 вариант: @Test(dependsOnMethods = d)
    public void c() {
        assertTrue (true);
    }

    @Test(priority = 4)
    //2 вариант: @Test(dependsOnMethods = e)
    public void d() {
        assertTrue (true);
    }

    @Test(priority = 3)
    //2 вариант: @Test(dependsOnMethods = f)
    public void e() {
        assertTrue (true);
    }

    @Test(priority = 2)
    //2 вариант: @Test(dependsOnMethods = g)
    public void f() {
        assertTrue (true);
    }

    @Test(priority = 1)
    public void g() {
        assertTrue (true);
    }
}
