

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;




public class helloworld {

	
    public static  void main(String[] args) throws InterruptedException {
        
    	 // declaration and instantiation of objects/variables
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Desktop\\chrome\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
        String baseUrl = "https://www.rabbitscams.sex";
        String expectedName = "Jenny";
      
        // launch Chrome and direct it to the Base URL
        driver.get(baseUrl);
        driver.manage().window().maximize();
       Thread.sleep(3000);
       //Locating search textarea in the web page
        WebElement createsearch = driver.findElement(By.xpath("//*[@id=\"body\"]/header/div[1]/div/div/form/input"));
        //createsearch.click();This step is not neede as search icon converts to a textarea on maximsing the window
        Thread.sleep(3000);
        createsearch.sendKeys("Jenny");
        createsearch.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        List<WebElement> list = driver.findElements(By.xpath("//div[@class='performer-card']"));
      
        // Finally, we'll loop over the list to verify each result link contains our term
        for (int i = 0; i < list.size(); i++) {
        	
        	 String Card_text = list.get(2).findElement(By.tagName("img")).getAttribute("alt");
        
        	 Assert.assertTrue(Card_text.contains(expectedName));
        	}
        	
        
        }}
    

       
    

