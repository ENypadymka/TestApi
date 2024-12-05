import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UiTest {

    @Test
    public void testPageTitle() {
        // Path to ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:/Work/chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("http://example.com");
            String pageTitle = driver.getTitle();
            assertEquals("Example Domain", pageTitle); // Title check
        } finally {
            driver.quit(); // Closing browser
        }
    }
}
