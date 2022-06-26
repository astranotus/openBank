package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    @Step("Открываем главную страницу")
    public MainPage openPage() {
        open("");
        return this;
    }

    public MainPage clickMainMenu(String value) {
        $$(".main-page-header__sub-nav-nav-item-box").find(text(value)).shouldBe(visible).click();
        return this;
    }

    public MainPage checkOpenMainMenu(String value) {
        $$(".main-page-header__links-wrapper").find(text(value)).shouldBe(visible);
        return this;
    }

    @Step("Проверяем наличие предложения от банка с картой 'Opencard'")
    public MainPage checkOfferOpencard() {
        $(".offers__card").shouldHave(text("Карта Opencard")).shouldBe(visible);
        return this;
    }

    @Step("Внутри предложения с картой 'Opencard' нажимаем кнопку 'Оформить карту'")
    public MainPage clickButtonOrderOpencard() {
        $(".offers__card").shouldHave(text("Оформить карту")).click();
        return this;
    }

    @Step("На открывшейся странице находим заголовок 'Ваша новая Opencard'")
    public MainPage checkHeaderOpencard() {
        $(".bs-header__page-title").shouldHave(text("Ваша новая Opencard")).shouldBe(visible);
        return this;
    }

    @Step("Проверяем наличие предложения от банка с картой '120 дней'")
    public MainPage checkOffer120Days() {
        $(".offers__card", 1).shouldHave(text("Карта 120 дней"));
        return this;
    }

    @Step("Внутри предложения с картой '120 дней' нажимаем кнопку 'Оформить карту'")
    public MainPage clickButtonOrder120Days() {
        $(".offers__card", 1).shouldHave(text("Оформить карту")).click();
        return this;
    }

    @Step("На открывшейся странице находим заголовок 'Кредитная Карта — 120 дней без % и платежей'")
    public MainPage checkHeader120days() {
        $(".bs-header__page-title").shouldHave(text("Кредитная Карта — 120 дней без % и платежей"));
        return this;
    }

    @Step("Проверяем наличие предложения от банка с кредитом 'Кредит наличными'")
    public MainPage checkOfferCredit() {
        $(".offers__card", 2).shouldHave(text("Кредит наличными"));
        return this;
    }

    @Step("Проверяем наличие предложения от банка с кредитом 'Кредит наличными'")
    public MainPage clickButtonOrderCredit() {
        $(".offers__card", 2).shouldHave(text("Оформить кредит")).click();
        return this;
    }

    @Step("На открывшейся странице находим заголовок 'Кредит наличными'")
    public MainPage checkHeaderCredit() {
        $(".BannerWrapper_banner-block-wrapper__zZlun").shouldHave(text("Кредит наличными"));
        return this;
    }
}
