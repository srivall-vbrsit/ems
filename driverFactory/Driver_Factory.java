package driverFactory;


	
	import java.time.Duration;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import io.github.bonigarcia.wdm.WebDriverManager;
	public class Driver_Factory {
		public WebDriver driver;
		
		public static ThreadLocal<WebDriver> tdriver=new ThreadLocal<>();
		public WebDriver init_driver(String browser) {
	 	if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			tdriver.set(new ChromeDriver());
			
		}else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			tdriver.set(new FirefoxDriver());
			
		}
		
		
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		getDriver().manage().deleteAllCookies();
		return getDriver();


}
		public static WebDriver getDriver() {
			// TODO Auto-generated method stub
				 return	tdriver.get();
		}
}