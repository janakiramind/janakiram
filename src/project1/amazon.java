package project1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\softwares\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.navigate().to("https://www.amazon.in/");  
    driver.manage().window().maximize();  
	Thread.sleep(5000);
	

	}

}
