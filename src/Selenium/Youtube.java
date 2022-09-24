package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Youtube {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", // kljucna metoda unutar jave
                "C:\\Users\\HP\\Desktop\\ChromeD\\chromedriver.exe");

        WebDriver wd = new ChromeDriver();
        wd.get("https://youtube.com");


        WebElement search = wd.findElement(By.xpath("/html[1]/body[1]/ytd-app[1]/div[1]/div[1]/ytd-masthead[1]/div[3]/div[2]/ytd-searchbox[1]/form[1]/div[1]/div[1]/input[1]"));
        search.sendKeys("CC2");
        assert search.isDisplayed();
        Thread.sleep(1000);
        WebElement dugme =wd.findElement(By.xpath("/html[1]/body[1]/ytd-app[1]/div[1]/div[1]/ytd-masthead[1]/div[3]/div[2]/ytd-searchbox[1]/button[1]"));
        dugme.click();
        Thread.sleep(1000);
        WebElement pesma = wd.findElement(By.xpath("/html[1]/body[1]/ytd-app[1]/div[1]/ytd-page-manager[1]/ytd-search[1]/div[1]/ytd-two-column-search-results-renderer[1]/div[1]/ytd-section-list-renderer[1]/div[2]/ytd-item-section-renderer[1]/div[3]/ytd-video-renderer[1]/div[1]/div[1]/div[1]/div[1]/h3[1]/a[1]/yt-formatted-string[1]"));
        pesma.click();



    }
}
