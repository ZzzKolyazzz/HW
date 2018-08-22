package rozetka;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChooseSmth extends Browser {

    @BeforeClass
    public static void Autorithation() {
        driver.manage().window().maximize();
        driver.navigate().to("https://my.rozetka.com.ua");
        if (driver.findElement(By.xpath("/html/body/a")).isDisplayed()) {

                driver.findElement(By.xpath("/html/body/a/span[2]/span")).click();
        }
        driver.findElement(By.cssSelector("#header_user_menu_parent > a")).click();

        WebElement fieldEmail = driver.findElement(By.xpath("//*[@id=\"popup_signin\"]/div[1]/div[1]/input"));
        WebElement fieldPassword = driver.findElement(By.xpath("//*[@id=\"popup_signin\"]/div[1]/div[2]/div[1]/div[1]/input"));
        fieldEmail.sendKeys("just.4gta4@mail.ru");
        fieldPassword.sendKeys("GodsB1essingYou");

        driver.findElement(By.xpath("//*[@id=\"popup_signin\"]/div[1]/div[2]/div[1]/div[2]/div/span/button")).click();
    }

    @Test
    public void ChooseCategory() {
        driver.navigate().to("https://my.rozetka.com.ua");
        driver.findElement(By.xpath("//*[@id=\"body-header\"]/div/div/div[2]/div[1]")).click();

        driver.findElement(By.xpath("//*[@id=\"13224\"]/a")).click();
        String expectedUrl = "https://rozetka.com.ua/kids/c88468/";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

}
