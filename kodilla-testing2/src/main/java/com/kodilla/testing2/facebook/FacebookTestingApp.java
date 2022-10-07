package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_COOKIES = "//div[@class=\"_9xo5\"]/button[1]";
    public static final String XPATH_NEW_ACCOUNT = "//div[@class=\"_6ltg\"]/a[1]";
    public static final String XPATH_BIRTHDAY_DAY = "//*[@id=\"day\"]";
    public static final String XPATH_BIRTHDAY_MONTH = "//*[@id=\"month\"]";
    public static final String XPATH_BIRTHDAY_YEAR = "//*[@id=\"year\"]";

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://facebook.com/");

        WebElement acceptCookies = driver.findElement(By.xpath(XPATH_COOKIES));
        acceptCookies.click();

        WebElement newAccount = driver.findElement(By.xpath(XPATH_NEW_ACCOUNT));
        newAccount.click();

        Thread.sleep(2000);

        WebElement comboBoxDay = driver.findElement(By.xpath(XPATH_BIRTHDAY_DAY));
        Select selectBirthdayDay = new Select(comboBoxDay);
        selectBirthdayDay.selectByValue("10");

        WebElement comboBoxMonth = driver.findElement(By.xpath(XPATH_BIRTHDAY_MONTH));
        Select selectBirthdayMonth = new Select(comboBoxMonth);
        selectBirthdayMonth.selectByVisibleText("Aug");

        WebElement comboBoxYear = driver.findElement(By.xpath(XPATH_BIRTHDAY_YEAR));
        Select selectBirthdayYear = new Select(comboBoxYear);
        selectBirthdayYear.selectByValue("2000");
    }
}