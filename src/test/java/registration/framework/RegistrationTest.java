package registration.framework;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import registration.framework.pages.HomePage;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Configuration.*;

public class RegistrationTest extends BaseTest {

    private HomePage homePage;

    @BeforeEach
    public void setUp() {
        open(baseUrl);

        homePage = new HomePage();
    }

    @Test
    public void registrationTest() {
        homePage.clickOnRegisterLink();
        sleep(3000);
    }
}
