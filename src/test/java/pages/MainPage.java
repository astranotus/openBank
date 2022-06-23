package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    public MainPage openPage() {
        open("");

        return this;
    }

    public MainPage clickMainMenu(String value) {
        $$(".main-page-header__sub-nav-nav-item-box").find(text(value)).click();

        return this;
    }

    public MainPage checkOpenMainMenu(String value) {
        $$(".main-page-header__links-wrapper").find(text(value)).shouldBe(visible);

        return this;
    }
}
