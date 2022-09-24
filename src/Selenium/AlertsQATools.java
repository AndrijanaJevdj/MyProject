package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

public class AlertsQATools {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", // kljucna metoda unutar jave
                "C:\\Users\\HP\\Desktop\\ChromeD\\chromedriver.exe");

        WebDriver wd = new ChromeDriver();
        wd.get("https://demoqa.com/alerts");

        wd.manage().window().maximize();
        Actions action = new Actions(wd);

        WebElement webElement = wd.findElement(By.id("alertButton"));
        webElement.click();
        Thread.sleep(1000);
        wd.switchTo().alert().accept();// switchuje na alert i accept na dugme;

        WebElement timerAlertButton = wd.findElement(By.id("timerAlertButton"));
        timerAlertButton.click();
        new WebDriverWait(wd, Duration.ofSeconds(5)).until(ExpectedConditions.alertIsPresent());
        wd.switchTo().alert().accept();
        Thread.sleep(1000);

        WebElement confirmButton = wd.findElement(By.id("confirmButton"));
        confirmButton.click();
        wd.switchTo().alert().accept();
        WebElement confirmResult= wd.findElement(By.id("confirmResult"));
        if (confirmResult.getText().contains("Ok")){
            System.out.println("Okej je");
        }
        WebElement promtButton= wd.findElement(By.id("promtButton"));
        promtButton.click();
        wd.switchTo().alert().sendKeys("Nesto");
        wd.switchTo().alert().accept();
        Thread.sleep(5000);



    }
}

