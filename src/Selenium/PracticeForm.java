package Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PracticeForm {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\ChromeD\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("https://demoqa.com/automation-practice-form");
        Actions act = new Actions(wd);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) wd;
        WebElement firstName = wd.findElement(By.id("firstName"));
        firstName.sendKeys("Andrijana");
        Thread.sleep(1000);

        WebElement lastName = wd.findElement(By.id("lastName"));
        lastName.sendKeys("Jevdjenijevic");
        Thread.sleep(1000);

        WebElement userEmail = wd.findElement(By.id("userEmail"));
        userEmail.sendKeys("jjvj@gmail.com");
        Thread.sleep(1000);

        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)", userEmail);
        WebElement genderRadio1 = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[3]/div[2]/div[1]/label[1]"));
        genderRadio1.click();
        Thread.sleep(1000);
        WebElement genderRadio2 = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[3]/div[2]/div[2]/label[1]"));
        genderRadio2.click();
        Thread.sleep(1000);
        WebElement genderRadio3 = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[3]/div[2]/div[3]/label[1]"));
        genderRadio3.click();
        Thread.sleep(1000);

        WebElement userNumber = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[4]/div[2]/input[1]"));
        userNumber.sendKeys("0123456789");
        Thread.sleep(1000);

        WebElement dateOfBirth = wd.findElement(By.id("dateOfBirthInput"));
        dateOfBirth.click();
        new Select(wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]"))).selectByVisibleText("October");
        new Select (wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/select[1]"))).selectByVisibleText("1999");
        WebElement day = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]"));
        day.click();


        WebElement hobi = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[7]/div[2]/div[3]/label[1]"));
        hobi.click();

        WebElement adresa = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[9]/div[2]/textarea[1]"));
        adresa.sendKeys("adresa");
        Thread.sleep(3000);
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)", adresa);
        // ne vidi se od reklama
        WebElement country= wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[10]/div[2]/div[1]/div[1]"));
        country.click();
        new Select(wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[10]/div[2]/div[1]/div[1]/div[1]/div[1]")));
        WebElement city= wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[10]/div[3]/div[1]/div[1]/div[1]/div[2]"));
        new Select(wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[10]/div[3]/div[1]/div[1]/div[1]/div[1]")));

         WebElement subject = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[6]/div[2]/div[1]/div[1]/div[1]"));
        subject.sendKeys(Keys.ENTER);


     //   wd.close();


    }
}
