package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import pages.MainPage;

public class BaseTest {

    MainPage mainPage = new MainPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://www.open.ru/";
        Configuration.browserSize = "1920x1080";
    }
}


