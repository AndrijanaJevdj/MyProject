package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class DragNDrop {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", // kljucna metoda unutar jave
                "C:\\Users\\HP\\Desktop\\ChromeD\\chromedriver.exe");

        WebDriver wd = new ChromeDriver();
        wd.get("https://demoqa.com/droppable");
        Actions actions = new Actions(wd);
//
//        WebElement draggable = wd.findElement(By.id("draggable"));
//        WebElement droppable = wd.findElement(By.id("droppable"));
//        actions.dragAndDrop(draggable, droppable).perform();

        WebElement droppableExampleTabAccept = wd.findElement(By.id("droppableExample-tab-accept"));
        droppableExampleTabAccept.click();
        WebElement acceptable = wd.findElement(By.id("acceptable"));
        WebElement droppable2 = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]"));
        actions.dragAndDrop(acceptable,droppable2).perform();
        if (droppable2.getText().contains("Dropped!")){
            System.out.println("Sve je okej!");
        }
        WebElement notAcceptable= wd.findElement(By.id("notAcceptable"));
        actions.dragAndDrop(notAcceptable, droppable2).perform();


        WebElement droppableExample2= wd.findElement(By.id("droppableExample-tab-preventPropogation"));
        droppableExample2.click();

        WebElement dragBox= wd.findElement(By.id("dragBox"));
        WebElement notGreedyDropBox= wd.findElement(By.id("notGreedyDropBox"));
        WebElement notGreedyInnerDropBox = wd.findElement(By.id("notGreedyInnerDropBox"));
        actions.dragAndDrop(dragBox,notGreedyInnerDropBox).perform();
        actions.dragAndDrop(dragBox,notGreedyInnerDropBox).perform();










    }
}
