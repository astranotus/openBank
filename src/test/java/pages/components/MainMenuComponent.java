package pages.components;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainMenuComponent {

    public void mainMenuClick(String value) {
        $$(".main-page-header__sub-nav-nav-item-box").find(text(value)).click();
    }
}
