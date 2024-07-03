package org.example.noveo.pages;

import io.qameta.allure.Step;
import lombok.RequiredArgsConstructor;
import org.example.noveo.service.PageService;
import org.springframework.stereotype.Component;

import static org.example.noveo.constants.MainPageConstants.SIGN_IN_LINK;
import static org.example.noveo.constants.SingInPageConstants.LOG_IN_TO_YOUR_ACCOUNT_HEADER;
import static org.example.noveo.locators.MainPageLocators.signInLink;
import static org.example.noveo.locators.SignInPageLocators.logInToYourAccountHeader;

@Component
@RequiredArgsConstructor
public class SignInPage {

    private final PageService pageService;

    @Step("Кликаем на линку Sign in и видим заголовок Log in to your account")
    public void clicksOnSignInLinkAndSeesHeaderLogInToYourAccount() {
        pageService.waitUntilPopUpMessageDisappearsAndSwitchesToIframe();
        pageService.clicksOnElement(signInLink, SIGN_IN_LINK);
        pageService.checksVisibilityAndNameOfElement(logInToYourAccountHeader, LOG_IN_TO_YOUR_ACCOUNT_HEADER);
    }
}
