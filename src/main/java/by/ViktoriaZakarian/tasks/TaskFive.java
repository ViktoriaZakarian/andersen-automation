package by.ViktoriaZakarian.tasks;

import by.ViktoriaZakarian.constants.DATA;
import by.ViktoriaZakarian.constants.Locators;
import by.ViktoriaZakarian.constants.URL;
import by.ViktoriaZakarian.driver.DriverSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TaskFive {
    public static void main(String[] args) {
        WebDriver driver = DriverSetUp.driverInit();
        driver.get(URL.ANDERSEN_LOGIN.getUrl());

        driver.findElement(By.name("email")).sendKeys(DATA.EMAIL.getData());
        driver.findElement(By.name("password")).sendKeys(DATA.PASSWORD.getData());
        driver.findElement(By.xpath(Locators.BUTTON_XPATH)).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath(Locators.INPUT_IMAGE_XPATH)).sendKeys("/Users/viktoriazakarian/Downloads//фото.jpg");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Locators.BUTTON_CLOSE_XPATH)));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath(Locators.BUTTON_CLOSE_XPATH)));
        driver.quit();
    }
}
