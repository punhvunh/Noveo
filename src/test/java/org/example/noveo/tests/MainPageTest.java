package org.example.noveo.tests;

import io.qameta.allure.Feature;
import org.example.noveo.pages.MainPage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.example.noveo.constants.AllureAnnotationConstants.MAIN_PAGE;

@Feature(MAIN_PAGE)
class MainPageTest extends BaseTest {

    @Autowired
    private MainPage mainPage;

    @Test
    void testClicksOnContactUsLinkAndSeesHeaderContactUs() {
        mainPage.clicksOnContactUsLinkAndSeesHeaderContactUs();
    }

}
