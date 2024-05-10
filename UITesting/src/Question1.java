import java.io.File;
import java.nio.file.Paths;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {

	public static void main(String[] args) {
		
	

        // Initialize Chrome WebDriver
        WebDriver driver = new ChromeDriver();

        // Set browser window size (resolution)
        //driver.manage().window().setSize(new Dimension(1920, 1080));
        driver.manage().window().setSize(new Dimension(1356, 864));
        //driver.manage().window().setSize(new Dimension(1366, 768));

        // Open the website
        driver.get("https://www.getcalley.com/");

        // Take a screenshot
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Save the screenshot with a timestamp
        String timestamp = String.valueOf(System.nanoTime());
        String screenshotPath = Paths.get("screenshots", "Desktop", "1356x864", "Screenshot-" + timestamp + ".png").toString();
        screenshotFile.renameTo(new File(screenshotPath));

        // Close the browser
        driver.quit();
	}

}
