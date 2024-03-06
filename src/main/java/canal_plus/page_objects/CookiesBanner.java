package canal_plus.page_objects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CookiesBanner {

    private final SelenideElement acceptBtn = $(".cookies__footer button");

    public void acceptCookies() {
        acceptBtn.click();
    }
}
