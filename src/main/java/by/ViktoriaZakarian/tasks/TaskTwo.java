package by.ViktoriaZakarian.tasks;

import by.ViktoriaZakarian.constants.URL;
import by.ViktoriaZakarian.driver.DriverSetUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

import java.util.ArrayList;
import java.util.List;

public class TaskTwo {
    public static void main(String[] args) {
        WebDriver driver = DriverSetUp.driverInit();

        List<String> handles = new ArrayList<>();

        for (URL url : URL.values()) {
            driver.switchTo().newWindow(WindowType.WINDOW);
            driver.get(url.getUrl());
            handles.add(driver.getWindowHandle());
        }

        for (String handle : handles) {
            driver.switchTo().window(handle);
            System.out.println(driver.getTitle() + "\\s" + driver.getCurrentUrl());
            if (driver.getTitle().contains("Zoo")) {
                driver.close();
            }
        }

        driver.quit();
    }
}
