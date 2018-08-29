package registration.framework.pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Condition.and;
import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;

public class BasePage {
    protected static final int WAIT_FOR_FRAME_TIMEOUT = 10000;
    protected static final int WAIT_FOR_ELEMENT_TIMEOUT = 20000;
    protected static final int POLLING_INTERVAL = 1000;

    // There is not isClickable condition in Selenide. We can create it.
    protected Condition clickable = and("Element can be clicked", visible, enabled);
}
