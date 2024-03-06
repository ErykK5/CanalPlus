package steps;

import canal_plus.page_objects.SportArticles;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.back;

public class BlogStepDef {

    private final SportArticles sportArticles = new SportArticles();

    @When("first article under sport category is clicked")
    public void clickFirstArticle() {
        sportArticles.clickOnArticle(0);
    }

    @And("user goes back and click see more under sport category")
    public void navigateBackAndClickSeeMore() {
        back();
        sportArticles.clickOnSeeMore();
    }
}
