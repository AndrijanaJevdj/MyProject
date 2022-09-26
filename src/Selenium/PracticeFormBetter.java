package Selenium;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeFormBetter {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\ChromeD\\chromedriver.exe");


        String firstName = "Andrijana";
        String lastName = "Jevdjenijevic";
        String studentName = firstName + " " + lastName;
        String email = "test@test.com";
        String gender = "female"; //za test
        String phoneNumber = "0123456789";
        String dateOfBirth = "3 October,1999"; //za test
        String subjects = "Maths"; //za test
        String hobbies = "Music"; //za test
        String picture = "Test.JPG";
        String filePath = "C:\\Users\\HP\\Desktop\\kursevi\\Test.JPG";
        String address = "Dragice Koncar";
        String state = "NCR";
        String city = "Delhi";
        String stateAndCity = state + " " + city;
        WebDriver wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.get("https://demoqa.com/automation-practice-form");
        JavascriptExecutor js = (JavascriptExecutor) wd;

        SetText(GetElementById(wd, "firstName"), firstName);
        SetText(GetElementById(wd, "lastName"), lastName);
        SetText(GetElementById(wd, "userEmail"), email);
        SelectGender(wd, "Female");
        SetText(GetElementById(wd, "userNumber"), phoneNumber);
        Thread.sleep(1000);
        SelectDate(wd, "October", "1999", "3");
        Thread.sleep(1000);
        SelectSubject(wd, "Maths");
        SelectHobbies(wd, "Music");
        UploadPicture(wd, filePath);
        SetText(GetElementById(wd, "currentAddress"), address);
        SelectStateAndCity(wd, state, city);
        wd.manage().window().fullscreen();
        Thread.sleep(1000);
        js.executeScript("arguments[0].scrollIntoView();", GetElementById(wd, "submit"));
        GetElementById(wd, "submit").click();

        Assert.isTrue(GetValueByLabel(wd, "Student Name").equalsIgnoreCase(studentName), "Name should be equals.");
        Assert.isTrue(GetValueByLabel(wd, "Student Email").equalsIgnoreCase(email), "Name should be equals.");
        Assert.isTrue(GetValueByLabel(wd, "Gender").equalsIgnoreCase(gender), "Name should be equals.");
        Assert.isTrue(GetValueByLabel(wd, "Mobile").equalsIgnoreCase(phoneNumber), "Name should be equals.");
        Assert.isTrue(GetValueByLabel(wd, "Date of Birth").equalsIgnoreCase(dateOfBirth), "Name should be equals.");
        Assert.isTrue(GetValueByLabel(wd, "Subjects").equalsIgnoreCase(subjects), "Name should be equals.");
        Assert.isTrue(GetValueByLabel(wd, "Hobbies").equalsIgnoreCase(hobbies), "Name should be equals.");
        Assert.isTrue(GetValueByLabel(wd, "Picture").equalsIgnoreCase(picture), "Name should be equals.");
        Assert.isTrue(GetValueByLabel(wd, "Address").equalsIgnoreCase(address), "Name should be equals.");
        Assert.isTrue(GetValueByLabel(wd, "State and City").equalsIgnoreCase(stateAndCity), "Name should be equals.");

        wd.close();
    }
    private static WebElement GetElementById(WebDriver driver, String id){
        return driver.findElement(By.id(id));
    }
    private static void SetText(WebElement element, String value){
        element.clear();
        element.sendKeys(value);
    }

    private static void SelectGender(WebDriver driver, String value){
        driver.findElement(By.xpath("//input[@value='"+value+"']/..")).click();
    }
    private static void SelectHobbies(WebDriver driver, String value){
        driver.findElement(By.xpath("//*[@id='hobbiesWrapper']//label[text()= '"+value+"']/..")).click();
    }

    private static void SelectDate(WebDriver driver, String month, String year, String day) throws InterruptedException {
        GetElementById(driver, "dateOfBirthInput").click();
        Thread.sleep(1000);
        Select monthSelect = new Select( driver.findElement(By.xpath("//div[@class='react-datepicker__month-container']//select[@class='react-datepicker__month-select']")));
        monthSelect.selectByVisibleText(month);
        Thread.sleep(1000);
        Select yearSelect = new Select( driver.findElement(By.xpath("//div[@class='react-datepicker__month-container']//select[@class='react-datepicker__year-select']")));
        yearSelect.selectByValue(year);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='react-datepicker__month']//div[text()='"+day+"' and contains(@aria-label,'"+month+"')]")).click();
        Thread.sleep(1000);

    }
    private static void SelectSubject(WebDriver driver, String value){
        WebElement element = GetElementById(driver, "subjectsInput");
        element.sendKeys(value);
        element.sendKeys(Keys.ENTER);
    }

    private static void UploadPicture(WebDriver driver, String filePath){
        GetElementById(driver, "uploadPicture").sendKeys(filePath);
    }

    private static void SelectStateAndCity(WebDriver driver, String state, String city){
        WebElement element = GetElementById(driver, "react-select-3-input");
        element.sendKeys(state);
        element.sendKeys(Keys.TAB);

        WebElement element1 = GetElementById(driver, "react-select-4-input");
        element1.sendKeys(city);
        element1.sendKeys(Keys.TAB);
    }

    private static String GetValueByLabel(WebDriver driver, String label){
        return driver.findElement(By.xpath("//div[@class='modal-content']//td[text()='" + label + "']/following-sibling::td")).getText();
    }
}
