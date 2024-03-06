package steps;

import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;

public class BlogAllSportStepDef {

    @Then("page {string} with all sport articles shows")
    public void verifyAllSportPageIsDisplayed(String expectedUrl) {
        webdriver().shouldHave(url(expectedUrl));
    }
}
