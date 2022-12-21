package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class WikiPage {

    private final SelenideElement
            findPageInput = $("#wiki-pages-filter");

    private final ElementsCollection
            pages = $$("#wiki-pages-box .Box-row");

    public WikiPage findPage(String value) {
        findPageInput.setValue(value).pressEnter();
        return this;
    }

    public WikiPage checkSoftAssertionsExistInPagesList() {
        pages.find(text("SoftAssertions")).shouldBe(visible);
        return this;
    }

    public void clickOnSPage(String pageName) {
        pages.find(text(pageName)).shouldBe(visible).click();
    }
}
