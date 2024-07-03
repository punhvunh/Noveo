package org.example.noveo.tests;

import io.qameta.allure.Feature;
import org.example.noveo.pages.MainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.example.noveo.constants.AllureAnnotationConstants.MAIN_PAGE;

@Feature(MAIN_PAGE)
class MainPageTest extends BaseTest {

    @Autowired
    private MainPage mainPage;

    @Test
    @DisplayName("Кликаем на линку Contact Us и видим заголовок Contact Us")
    void testClicksOnContactUsLinkAndSeesHeaderContactUs() {
        mainPage.clicksOnContactUsLinkAndSeesHeaderContactUs();
    }

    @Test
    @DisplayName("Проверяем количество популярных продуктов на странице")
    void testChecksAmountOfPopularProductOnPage(){
        mainPage.checksAmountOfPopularProductOnPage();
    }

}
