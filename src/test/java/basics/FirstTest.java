package basics;

import com.codeborne.selenide.Condition;
import org.junit.Test;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FirstTest {

    @Test
    public void openAndSerchInGoogle() {

        // Magic happens here. It opens a Firefox without defining a driver !!!
        // How cool it is that :D
        open("http://google.com");

        // Bad practice. I do it only to slow the test down for presentation purpose.
        sleep(3000);

        // $ - find element.
        $(byName("q")).setValue("robertkaszubowski.com").pressEnter();

        sleep(3000);

        $(byText("robertkaszubowski")).click();

        sleep(3000);

        // Selenide even has assertions. But I still prefer assertJ ones.
        $(byText("HOME")).shouldBe(Condition.visible);
        $(byText("ABOUT ME")).shouldBe(Condition.visible);

        close();
    }
}
