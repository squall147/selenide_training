package registration.framework.tests;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import registration.framework.pages.HomePage;
import registration.framework.pages.LoginPage;
import registration.framework.pages.RegistrationConfirmationPage;
import registration.framework.pages.RegistrationPage;
import registration.framework.testdata.RegistrationTestData;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Configuration.*;
import static org.assertj.core.api.Assertions.assertThat;

public class RegistrationTest extends BaseTest {

    private HomePage homePage;
    private RegistrationPage registrationPage;
    private RegistrationConfirmationPage registrationConfirmationPage;
    private LoginPage loginPage;

    @BeforeEach
    public void setUp() {
        open(baseUrl);

        homePage = new HomePage();
        registrationPage = new RegistrationPage();
        registrationConfirmationPage = new RegistrationConfirmationPage();
        loginPage = new LoginPage();
    }

    @Test
    public void registrationTest() {
        homePage.clickOnRegisterLink();

        homePage.clickOnRegisterLink();
        registrationPage.inputContactInformationForm(RegistrationTestData.FIRST_NAME,
                RegistrationTestData.LAST_NAME,
                RegistrationTestData.PHONE_NUMBER,
                RegistrationTestData.EMAIL)
                .inputMailingInformationForm(RegistrationTestData.ADDRESS_1,
                        RegistrationTestData.ADDRESS_2,
                        RegistrationTestData.CITY,
                        RegistrationTestData.STATE,
                        RegistrationTestData.ZIP_CODE,
                        RegistrationTestData.COUNTRY)
                .inputUserInformationForm(RegistrationTestData.USER_NAME,
                        RegistrationTestData.PASSWORD,
                        RegistrationTestData.PASSWORD)
                .clickOnSubmitButton();
        registrationConfirmationPage.clickOnSignInLink();
        loginPage.userLogin(RegistrationTestData.USER_NAME,
                RegistrationTestData.PASSWORD);

        // I prefer standard assertions. We can improve their readability by
        // introducing AssertJ library for assertions.
        assertThat(homePage.isUserIsLoggedIn())
                .as("User is not logged in.").isTrue();
    }
}
