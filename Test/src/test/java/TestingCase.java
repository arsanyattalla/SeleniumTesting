import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class TestingCase {

    static WebDriver driver;

    @Test
    public void TestCase() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=1920x1080");
        options.addArguments("disable-gpu");




         options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--ignore-certificate-errors");
        //options.addArguments("--ignore-certificate-errors");

        driver = new ChromeDriver(options);
        // driver.manage().window().maximize();
        driver.get("https://staging1.zomepower.com");

        //Login
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("zome_analyst");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test@123");
        driver.findElement(By.xpath(
                "//button[@class='login-btn-style white-text-color block cursor-pointer text-center']")).click();
        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//button[contains(text(),'TESTBED-STAGE')]")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //1st device in device list
        driver.findElement(By.xpath("//table/tbody/tr[1]/td[8]/div/div[2]")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int j = 0; j < 4; j++) {
            driver.findElement(By.xpath("//button[contains(text(),'+')]")).click();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        driver.findElement(By.xpath("//button[contains(text(),'Set temperature')]")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //2nd device in the device list
        driver.findElement(By.xpath("//table/tbody/tr[2]/td[8]/div/div[2]")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int j = 0; j < 4; j++) {
            driver.findElement(By.xpath("//button[contains(text(),'+')]")).click();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        driver.findElement(By.xpath("//button[contains(text(),'Set temperature')]")).click();

        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //driver.quit();

        //3rd device in device list
        driver.findElement(By.xpath("//table/tbody/tr[3]/td[8]/div/div[2]")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int j = 0; j < 4; j++) {
            driver.findElement(By.xpath("//button[contains(text(),'+')]")).click();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        driver.findElement(By.xpath("//button[contains(text(),'Set temperature')]")).click();
        //String actualString = driver.findElement(By.xpath("//div[@class='ant-message-notice']")).getText();
        //Assert.assertTrue(actualString.contains("Device temperature update successfully"));
        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //4th device in device list
        driver.findElement(By.xpath("//table/tbody/tr[4]/td[8]/div/div[2]")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int j = 0; j < 4; j++) {
            driver.findElement(By.xpath("//button[contains(text(),'+')]")).click();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        driver.findElement(By.xpath("//button[contains(text(),'Set temperature')]")).click();
        //String actualString = driver.findElement(By.xpath("//div[@class='ant-message-notice']")).getText();
        //Assert.assertTrue(actualString.contains("Device temperature update successfully"));
        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//table/tbody/tr[3]/td[8]/div/div[2]")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int j = 0; j < 4; j++) {
            driver.findElement(By.xpath("//button[contains(text(),'+')]")).click();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        driver.findElement(By.xpath("//button[contains(text(),'Set temperature')]")).click();
        //String actualString = driver.findElement(By.xpath("//div[@class='ant-message-notice']")).getText();
        //Assert.assertTrue(actualString.contains("Device temperature update successfully"));
        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //5th device in device list
        driver.findElement(By.xpath("//table/tbody/tr[5]/td[8]/div/div[2]")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int j = 0; j < 4; j++) {
            driver.findElement(By.xpath("//button[contains(text(),'+')]")).click();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        driver.findElement(By.xpath("//button[contains(text(),'Set temperature')]")).click();
        //String actualString = driver.findElement(By.xpath("//div[@class='ant-message-notice']")).getText();
        //Assert.assertTrue(actualString.contains("Device temperature update successfully"));
        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    


}







