package rozetka;

import jdk.nashorn.internal.AssertsEnabled;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class BuySmth extends Browser {

    @Test
    public void BuySmth() throws InterruptedException {
        driver.manage().window().maximize();
        driver.navigate().to("https://my.rozetka.com.ua");
        driver.findElement(By.xpath("//*[@id=\"body-header\"]/div/div/div[2]/div[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"13224\"]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"content-inner-block\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/div/div[3]/div/div/div[1]/div/div[1]/div[2]/div/p/a")).click();
        driver.findElement(By.xpath("//*[@id=\"content-inner-block\"]/div[3]/div/div/div[2]/div/div[1]/div[1]/div/div[3]/div/div/div[1]/div/div[1]/div[3]/div/p/a")).click();
        driver.findElement(By.xpath("//*[@id=\"catalog_goods_block\"]/div/div[10]/div[1]/div/div/div/div[6]/div/div/div/form/span/button")).click();
        TimeUnit.SECONDS.sleep(15);
        driver.findElement(By.xpath("//*[@id=\"cart-popup\"]/div[2]/div[1]/div[2]")).isDisplayed();




    }

}
