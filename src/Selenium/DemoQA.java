package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

    public class DemoQA {
        public static void main(String[] args) throws IOException, InterruptedException {
            System.setProperty("webdriver.chrome.driver", // kljucna metoda unutar jave
                    "C:\\Users\\HP\\Desktop\\ChromeD\\chromedriver.exe");

            WebDriver wd = new ChromeDriver();
            wd.get("https://demoqa.com/text-box");
            wd.manage().window().maximize();



            wd.get("https://demoqa.com/text-box");
            WebElement inputName = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[2]/input[1]"));
            inputName.sendKeys("Andrijana");
            Thread.sleep(1000);
            WebElement element = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[1]"));
            //System.out.println(element.getText());
            WebElement inputEmail=wd.findElement(By.id("userEmail"));

            inputEmail.sendKeys("riki@gmail.com");
            Thread.sleep(1000);
            WebElement curentLocation= wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[3]/div[1]/label[1]"));
            WebElement inputCL= wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[3]/div[2]/textarea[1]"));
            inputCL.sendKeys("Voje Bogdanovica 15");
            Thread.sleep(1000);
            WebElement pAdress= wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[4]/div[1]/label[1]"));
            WebElement inputPadress= wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[4]/div[2]/textarea[1]"));
            inputPadress.sendKeys("Voje Bogdanovica 27");
            Thread.sleep(1000);
            WebElement submitBtn= wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[1]/button[1]"));
            submitBtn.click();
            Thread.sleep(1000);
            WebElement testName= wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[6]/div[1]/p[1]"));
            //System.out.println(testName.getText().equals("Name:Zarko"));
            boolean a=testName.getText().equals("Name:Andrijana");
            WebElement testCL= wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[6]/div[1]/p[3]"));
            // System.out.println(testCL.getText().equals("Current Address :nova ulica 10"));
            boolean b=testCL.getText().equals("Current Address : Voje Bogdanovica 15");
            WebElement testPA= wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[6]/div[1]/p[4]"));
            // System.out.println(testPA.getText().equals("Permananet Address :nova ulica 15"));
            boolean c=testPA.getText().equals("Permananet Address :Voje Bogdanovica 27");
            WebElement testEmail= wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[6]/div[1]/p[2]"));
            // System.out.println(testEmail.getText().equals("Email:nanana@gmail.com"));
            boolean d=testEmail.getText().equals("Email: riki@gmail.com");
            if(a && b && c && d){
                System.out.println("Sve u redu! ");
            }
            // wd.close();

        }
}
