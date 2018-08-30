package registration.framework.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage extends BasePage {

    private SelenideElement nameField = $(byName("firstName"));
    private SelenideElement lastNameField = $(byName("lastName"));
    private SelenideElement phoneField = $(byName("phone"));
    private SelenideElement emailField = $(byName("userName"));
    private SelenideElement adress1Field = $(byName("address1"));
    private SelenideElement adress2Field = $(byName("address2"));
    private SelenideElement cityField = $(byName("city"));
    private SelenideElement stateField = $(byName("state"));
    private SelenideElement postalCodeField = $(byName("postalCode"));
    private SelenideElement countryField = $(byName("country"));
    private SelenideElement userNameField = $(byName("email"));
    private SelenideElement passwordField = $(byName("password"));
    private SelenideElement confirmPasswordField = $(byName("confirmPassword"));
    private SelenideElement submitButton = $(byName("register"));

    public RegistrationPage inputContactInformationForm(String name, String lastName,
                                            String phoneNumber, String email) {
        nameField.setValue(name);
        lastNameField.setValue(lastName);
        phoneField.setValue(phoneNumber);
        emailField.setValue(email);
        return this;
    }

    public RegistrationPage inputMailingInformationForm(String address1, String address2,
                                            String city, String state, String postalCode, String country) {
        adress1Field.setValue(address1);
        adress2Field.setValue(address2);
        cityField.setValue(city);
        stateField.setValue(state);
        postalCodeField.setValue(postalCode);
        // Dealing with drop downs is easier too.
        countryField.selectOptionContainingText(country);
        return this;
    }

    public RegistrationPage inputUserInformationForm(String userName, String password,
                                         String confirmPassword) {
        userNameField.setValue(userName);
        passwordField.setValue(password);
        confirmPasswordField.setValue(confirmPassword);
        return this;
    }

    public RegistrationPage clickOnSubmitButton() {
        submitButton.click();
        return this;
    }
}
