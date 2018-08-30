package registration.framework.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationConfirmationPage extends BasePage {

    private SelenideElement signInLink = $(byLinkText("sign-in"));

    public RegistrationConfirmationPage clickOnSignInLink() {
        signInLink.click();
        return this;
    }
}
