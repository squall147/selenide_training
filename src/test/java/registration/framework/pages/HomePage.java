package registration.framework.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class HomePage extends BasePage {

    private SelenideElement signOnLinkElement = $(byLinkText("SIGN-ON"));
    private SelenideElement signOffLinkElement = $(byLinkText("SIGN-OFF"));
    private SelenideElement registerLinkElement = $(byLinkText("REGISTER"));
    private SelenideElement homeLinkElement = $(byLinkText("Home"));
    private SelenideElement userNameFieldElement = $(byName("userName"));
    private SelenideElement passwordFieldElement = $(byName("password"));
    private SelenideElement signInButton = $(byName("login"));

    public HomePage clickOnRegisterLink() {
        registerLinkElement.click();
        return this;
    }

    public boolean isUserIsLoggedIn() {
        return signOffLinkElement.isDisplayed();
    }
}
