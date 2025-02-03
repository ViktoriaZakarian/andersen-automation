package by.ViktoriaZakarian.tasks;

import by.ViktoriaZakarian.constants.DATA;
import by.ViktoriaZakarian.constants.Locators;
import by.ViktoriaZakarian.constants.URL;
import by.ViktoriaZakarian.driver.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TaskFour {
    public static void main(String[] args) {
        WebDriver driver = DriverSetUp.driverInit();
        driver.get(URL.ANDERSEN_LOGIN.getUrl());

        driver.findElement(By.name("email")).sendKeys(DATA.EMAIL.getData());
        driver.findElement(By.name("password")).sendKeys(DATA.PASSWORD.getData());
        driver.findElement(By.xpath(Locators.BUTTON_XPATH)).click();
    }
}
