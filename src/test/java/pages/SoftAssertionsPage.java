package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class SoftAssertionsPage {

    private final SelenideElement
            wikiBody = $("#wiki-body");

    public void checkJunit5CodeExampleExist() {
        wikiBody.shouldHave(text("Using JUnit5 extend test class"));
    }
}
