package basics;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Configuration.*;


public class FirstTest {

    @Test
    public void openAndSerchInGoogle() {

        // Magic happens here. It opens a Firefox without defining a driver !!!
        // How cool it is that :D
        open("http://google.com");

        // Bad practice. I do it only to slow the test down for presentation purpose.
        sleep(3000);

        // $ - find element.
        $(byName("q")).setValue("http://robertkaszubowski.com/").pressEnter();

        sleep(3000);

        $(byText("robertkaszubowski")).click();

        sleep(3000);

        // Selenide even has assertions. But I still prefer assertJ ones.
        $(byText("HOME")).shouldBe(Condition.visible);
        $(byText("ABOUT ME")).shouldBe(Condition.visible);

        close();
    }

    @Test
    public void simpleConfigurationAndUsingPureSelenium() {

        // System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriverMac");
        // We can do it easier without downloading drivers:
        ChromeDriverManager.getInstance().setup();
        browser = "chrome";

        // We have access to Selenium methods. However in many cases we do not need them.
        WebDriverRunner.clearBrowserCache();
        WebDriverRunner.getWebDriver().manage().window().maximize();
        baseUrl = "http://robertkaszubowski.com/";

        open(baseUrl);
        sleep(3000);
        close();

        browser = "firefox";

        open(baseUrl);
        sleep(3000);
        close();
    }
}
