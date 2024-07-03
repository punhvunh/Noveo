package org.example.noveo.pages;

import io.qameta.allure.Step;
import lombok.RequiredArgsConstructor;
import org.example.noveo.service.PageService;
import org.springframework.stereotype.Component;

import static org.example.noveo.constants.MainPageConstants.CONTACT_US_HEADER;
import static org.example.noveo.constants.MainPageConstants.CONTACT_US_LINK;
import static org.example.noveo.constants.MainPageConstants.IFRAME;
import static org.example.noveo.constants.MainPageConstants.POP_UP_MESSAGE;
import static org.example.noveo.locators.MainPageLocators.contactUsHeader;
import static org.example.noveo.locators.MainPageLocators.contactUsLink;
import static org.example.noveo.locators.MainPageLocators.iframe;
import static org.example.noveo.locators.MainPageLocators.popUpMessage;

@Component
@RequiredArgsConstructor
public class MainPage {

    private final PageService pageService;

    @Step("Кликаем на линку Contact Us и видим заголовок Contact Us")
    public void clicksOnContactUsLinkAndSeesHeaderContactUs() {
        pageService.waitUntilElementAppear(popUpMessage, POP_UP_MESSAGE, 10);
        pageService.elementIsNotVisible(popUpMessage, POP_UP_MESSAGE);
        pageService.switchesToFrame(iframe, IFRAME);
        pageService.clicksOnElement(contactUsLink, CONTACT_US_LINK);
        pageService.checksVisibilityAndNameOfElement(contactUsHeader, CONTACT_US_HEADER);
    }
}

