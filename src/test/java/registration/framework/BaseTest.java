package registration.framework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.close;

public class BaseTest {

    @BeforeAll
    public static void setUpTests() {
        baseUrl = "http://newtours.demoaut.com";
    }

    @AfterAll
    public static void tearDown() {
        close();
    }
}
