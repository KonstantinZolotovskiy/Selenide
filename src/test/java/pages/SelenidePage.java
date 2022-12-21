package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenidePage {

    private final SelenideElement
            repositoryTitle = $("#repository-container-header"),
            wikiTab = $("#wiki-tab");

    public SelenidePage openSelenidePage() {
        open("https://github.com/selenide/selenide");
        repositoryTitle.shouldHave(Condition.text("Selenide / Selenide"));
        return this;
    }

    public void clickOnWikiTab() {
        wikiTab.click();
    }
}
