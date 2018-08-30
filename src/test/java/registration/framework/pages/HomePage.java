package registration.framework.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class HomePage extends BasePage {

    private SelenideElement signOffLinkElement = $(byLinkText("SIGN-OFF"));
    private SelenideElement registerLinkElement = $(byLinkText("REGISTER"));

    public HomePage clickOnRegisterLink() {
        // Example of wait. We do not need it. I use it for training purposes.
        registerLinkElement.waitUntil(clickable, WAIT_FOR_ELEMENT_TIMEOUT, POLLING_INTERVAL).click();
        // We canu use as well Selenide conditions, eg. Condition.visible.
        return this;
    }

    public boolean isUserIsLoggedIn() {
        return signOffLinkElement.isDisplayed();
    }
}
