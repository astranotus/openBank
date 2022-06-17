package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import pages.MainPage;

public class BaseTest {

    MainPage mainPage = new MainPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://www.open.ru/";
        Configuration.browserSize = "1920x1080";
    }

    @BeforeEach
    public void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }
}
