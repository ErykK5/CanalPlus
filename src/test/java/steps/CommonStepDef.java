package steps;

import canal_plus.page_objects.CookiesBanner;
import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.Given;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class CommonStepDef {

    private final CookiesBanner cookiesBanner = new CookiesBanner();

    @Given("page {string} is loaded")
    public void pageIsLoaded(String expectedUrl) {
        Configuration.timeout = 10_000;
        open(expectedUrl);
        getWebDriver().manage().window().maximize();
        cookiesBanner.acceptCookies();

        webdriver().shouldHave(url(expectedUrl));
    }
}
