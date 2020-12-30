package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
    private WebDriver driver = new ChromeDriver();
    WebElement element;

    @BeforeMethod
    public void setUp() {

    }

    @Test
    public void testRegistration() {
        WebElement element;
        driver.get("https://contacts-app.tobbymarshall815.vercel.app/login");
        driver.manage().window().maximize();
        element = driver.findElement(By.xpath("//*[contains(., ' Registration')]"));
        element.click();
//        driver.get("http://htmlpreview.github.io/?https://github.com/Krutybych/selenium/blob/master/index.html");
//        element = driver.findElement(By.cssSelector("a.btn.btn-secondary-round"));
//        element = driver.findElement(By.id("loving"));
//        element.sendKeys("hello");
//        element.sendKeys(Keys.ENTER);

//        driver.get("https://contacts-app.tobbymarshall815.vercel.app/login");
//        driver.manage().window().maximize();
//        driver.findElement(By.xpath("//*[text()='Registration']"));
//        element.click();
//        element = driver.findElement(By.cssSelector("input[placeholder='Email']"));
//        element.sendKeys("hello");
//        element.click();
    }

    @AfterMethod
    public void tearDown() {

    }
}
