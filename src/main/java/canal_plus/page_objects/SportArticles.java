package canal_plus.page_objects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;

public class SportArticles {

    private final ElementsCollection allArticles = $$x("//h2[text()='Sport']/following-sibling::div[1]//a[contains(@class, 'MuiTypography-root')]");
    private final SelenideElement seeMoreBtn = $x("//h2[contains(text(),'Sport')]/following-sibling::div[1]/button");

    public void clickOnArticle(int number) {
        allArticles.get(number).click();
        webdriver().shouldHave(urlContaining("artykuly/sport"));
    }

    public void clickOnSeeMore() {
        seeMoreBtn.click();
        webdriver().shouldHave(urlContaining("artykuly/sport"));
    }
}