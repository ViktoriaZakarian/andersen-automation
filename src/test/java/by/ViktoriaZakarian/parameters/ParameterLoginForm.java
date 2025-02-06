package by.ViktoriaZakarian.parameters;

import by.ViktoriaZakarian.driver.DriverSetUp;
import by.ViktoriaZakarian.utils.Locators;
import by.ViktoriaZakarian.utils.URL;
import by.ViktoriaZakarian.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class ParameterLoginForm {

    @Test
    @Parameters({"email", "password"})
    public void loginTest(String email, String password) {
        WebDriver driver = DriverSetUp.driverInit();
        driver.get(URL.ANDERSEN_LOGIN);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email"))).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath(Locators.BUTTON_XPATH)).click();
        Assert.assertEquals(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Locators.POSITION_XPATH))).getText(), Utils.POSITION_TEXT);
        driver.quit();
    }
}
