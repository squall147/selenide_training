package registration.framework.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasePage {

    private SelenideElement userNameFieldElement = $(byName("userName"));
    private SelenideElement passwordFieldElement = $(byName("password"));
    private SelenideElement submitButton = $(byName("login"));

    public LoginPage userLogin(String userName, String password) {
        userNameFieldElement.setValue(userName);
        passwordFieldElement.setValue(password);
        submitButton.click();
        return this;
    }
}
