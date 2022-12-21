package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.SelenidePage;
import pages.SoftAssertionsPage;
import pages.WikiPage;

import static com.codeborne.selenide.Configuration.*;

public class SoftAssertionsTests {

    private final SelenidePage selenidePage = new SelenidePage();
    private final WikiPage wikiPage = new WikiPage();
    private final SoftAssertionsPage softAssertionsPage = new SoftAssertionsPage();

    @BeforeAll
    public static void setUp() {
        browserSize = "1920x1080";
    }

    @Test
    public void softAssertionsTest() {
        selenidePage.openSelenidePage()
                .clickOnWikiTab();

        wikiPage.findPage("SoftAssertion")
                .checkSoftAssertionsExistInPagesList()
                .clickOnSPage("SoftAssertion");

        softAssertionsPage.checkJunit5CodeExampleExist();
    }
}
