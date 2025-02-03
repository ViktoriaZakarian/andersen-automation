package by.ViktoriaZakarian.tasks;

import by.ViktoriaZakarian.constants.DATA;
import by.ViktoriaZakarian.constants.Locators;
import by.ViktoriaZakarian.constants.URL;
import by.ViktoriaZakarian.driver.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

public class TaskOne {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverSetUp.driverInit();
        driver.get(URL.ANDERSEN_LOGIN.getUrl());

        driver.findElement(By.name("email")).sendKeys(DATA.INVALID_EMAIL.getData());
        driver.findElement(By.name("password")).sendKeys(DATA.PASSWORD.getData());
        driver.findElement(By.xpath(Locators.BUTTON_XPATH)).click();
        Thread.sleep(2000);
        driver.navigate().refresh();

        driver.findElement(By.name("email")).sendKeys(DATA.EMAIL.getData());
        driver.findElement(By.name("password")).sendKeys(DATA.INVALID_PASSWORD.getData());
        driver.findElement(By.xpath(Locators.BUTTON_XPATH)).click();
        Thread.sleep(2000);

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(URL.ANDERSEN_REGISTRATION.getUrl());
        driver.findElement(By.name("firstName")).sendKeys(DATA.INVALID_FIRST_NAME.getData());
        driver.findElement(By.name("lastName")).sendKeys(DATA.INVALID_LAST_NAME.getData());
        driver.findElement(By.name("dateOfBirth")).sendKeys(DATA.DATE_OF_BIRTH.getData());
        driver.findElement(By.name("email")).sendKeys(DATA.EMAIL.getData());
        driver.findElement(By.name("password")).sendKeys(DATA.INVALID_PASSWORD.getData());
        driver.findElement(By.name("passwordConfirmation")).sendKeys(DATA.INVALID_PASSWORD.getData());
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath(Locators.BUTTON_XPATH)));
        Thread.sleep(2000);
        driver.navigate().refresh();

        driver.findElement(By.name("firstName")).sendKeys(DATA.FIRST_NAME.getData());
        driver.findElement(By.name("lastName")).sendKeys(DATA.LAST_NAME.getData());
        driver.findElement(By.name("dateOfBirth")).sendKeys(DATA.DATE_OF_BIRTH.getData());
        driver.findElement(By.name("email")).sendKeys(DATA.EMAIL.getData());
        driver.findElement(By.name("password")).sendKeys(DATA.PASSWORD.getData());
        driver.findElement(By.name("passwordConfirmation")).sendKeys(DATA.INVALID_PASSWORD.getData());
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath(Locators.BUTTON_XPATH)));
        Thread.sleep(2000);

        driver.quit();
    }
}
