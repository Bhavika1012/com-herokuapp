import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(); //Setting up chrome browser
        driver.get("http://the-internet.herokuapp.com/login"); //opening the url
        System.out.println("The title of the page is: " + driver.getPageSource());  //Printing and getting the title of the page
        System.out.println("The current URL is: " + driver.getCurrentUrl()); //Printing and getting the current URL
        System.out.println("The page source is: " + driver.getPageSource()); //Printing and getting Page source

        driver.findElement(By.id("username")).sendKeys("Prime"); //Finding the element by ID and then entering email with sendKeys
        driver.findElement(By.id("password")).sendKeys("Prime123"); //Finding the element by ID and then entering password with sendKeys

        driver.close(); //closing browser

    }
}
