import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class first_test{
    public static void mian(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Kuba\\Desktop\\testy automaty\\proj1\\src\\test\\java\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.get("http://automationpractice.com/index.php");

        driver.quit();
    }

 }