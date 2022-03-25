package Sugarcrem;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testauto {
	WebDriver driver;
	@Test
public void runtunisianet() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
        // System.setProperty("webdriver.chrome.driver","C:\\Users\\mrbaati\\Desktop\\jjjjj\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
	
        
        // open site web tunisianet 
driver.get("https://www.tunisianet.com.tn/");
        
        //remplir champ
        driver.findElement(By.xpath("//input[@class='search_query form-control ui-autocomplete-input']"))
        .sendKeys("Dell");
        Thread.sleep(3000);
        //click serash 
        driver.findElement(By.xpath("//*[@id=\"sp-btn-search\"]/button")).click();

}
}