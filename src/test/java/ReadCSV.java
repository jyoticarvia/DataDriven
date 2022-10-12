import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.net.URL;
import java.util.Scanner;

public class ReadCSV {
    @Test
    public void readCsv() throws Exception {
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        String Url = "";
        Scanner sc = new Scanner(new File("/home/ankush/DataDriven/src/test/resources/csv demo - Sheet1 (3).csv"));
        while (sc.hasNext())
        {
            Url = sc.next();
            System.out.print(Url);
        }
        driver.get(Url);
    }
}
