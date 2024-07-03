package org.example.noveo.pages;

import io.qameta.allure.Step;
import lombok.RequiredArgsConstructor;
import org.example.noveo.service.PageService;
import org.springframework.stereotype.Component;

import static org.example.noveo.constants.MainPageConstants.CONTACT_US_HEADER;
import static org.example.noveo.constants.MainPageConstants.CONTACT_US_LINK;
import static org.example.noveo.constants.MainPageConstants.PRODUCT;
import static org.example.noveo.locators.MainPageLocators.contactUsHeader;
import static org.example.noveo.locators.MainPageLocators.contactUsLink;
import static org.example.noveo.locators.MainPageLocators.POPULAR_PRODUCTS_XPATH;

@Component
@RequiredArgsConstructor
public class MainPage {

    private final PageService pageService;

    @Step("Кликаем на линку Contact Us и видим заголовок Contact Us")
    public void clicksOnContactUsLinkAndSeesHeaderContactUs() {
        pageService.waitUntilPopUpMessageDisappearsAndSwitchesToIframe();
        pageService.clicksOnElement(contactUsLink, CONTACT_US_LINK);
        pageService.checksVisibilityAndNameOfElement(contactUsHeader, CONTACT_US_HEADER);
    }

    @Step("Проверяем количество популярных продуктов на странице")
    public void checksAmountOfPopularProductOnPage() {
        pageService.waitUntilPopUpMessageDisappearsAndSwitchesToIframe();
        pageService.checksTheNumberOfSameElements(POPULAR_PRODUCTS_XPATH, 8,PRODUCT);
    }
}

