
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.sleep;

public class test1 {


    @Test
    public void poprawnelogowanie() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Kuba\\Desktop\\testy automaty\\project1\\src\\test\\java\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        //driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

        driver.findElement(By.cssSelector("[title=\"Log in to your customer account\"]")).click();

        driver.findElement(By.id("email_create")).sendKeys("jakismail1175@cos.com");

        driver.findElement(By.id("SubmitCreate")).click();

        sleep(4000);

        driver.findElement(By.id("id_gender1")).click();//Mr button
        //driver.findElement(By.id("id_gender2")).click();//Mrs button

        driver.findElement(By.id("customer_firstname")).sendKeys("JakiesImie");
        driver.findElement(By.id("customer_lastname")).sendKeys("JakiesNazwisko");

        driver.findElement(By.id("passwd")).sendKeys("qwer1234");

        new Select(driver.findElement(By.id("days"))).selectByValue("18");

        new Select(driver.findElement(By.id("months"))).selectByValue("2");

        new Select(driver.findElement(By.id("years"))).selectByValue("1900");

        driver.findElement(By.id("uniform-newsletter")).click();

        driver.findElement(By.id("address1")).sendKeys("ul. Gdzies tam 42");

        driver.findElement(By.id("city")).sendKeys("Miasto-ciasto");

        new Select(driver.findElement(By.id("id_state"))).selectByVisibleText("Hawaii");

        driver.findElement(By.id("postcode")).sendKeys("42000");

        driver.findElement(By.id("phone_mobile")).sendKeys("123456789");

        driver.findElement(By.id("submitAccount")).click();

        sleep(4000);


        if(driver.getCurrentUrl().contentEquals("http://automationpractice.com/index.php?controller=my-account")){
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }

        /*if(driver.getTitle().contentEquals("My account - My Store")){
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
        */

        //sleep(5000);
        driver.quit();
    }


}
