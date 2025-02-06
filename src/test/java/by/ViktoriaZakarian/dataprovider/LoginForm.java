package by.ViktoriaZakarian.dataprovider;

import by.ViktoriaZakarian.driver.DriverSetUp;
import by.ViktoriaZakarian.utils.Locators;
import by.ViktoriaZakarian.utils.URL;
import by.ViktoriaZakarian.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginForm {

    @Test(dataProvider = "loginData")
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

    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][]{
                {"zakarianviktoria@gmail.com", "Vikintosh_708"},
                {"zakarian.viktoria@yandex.by", "qwer1234"},
                {"swaps-onyx0x@icloud.com", "qazwsxedc"},
        };
    }
}
