package org.example.noveo.tests;

import io.qameta.allure.Feature;
import org.example.noveo.pages.SignInPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.example.noveo.constants.AllureAnnotationConstants.SIG_IN_PAGE;

@Feature(SIG_IN_PAGE)
class SignInPageTest extends BaseTest{

    @Autowired
    private SignInPage signInPage;

    @Test
    @DisplayName("Кликаем на линку Sign in и видим заголовок Log in to your account")
    void testClicksOnSignInLinkAndSeesHeaderLogInToYourAccount(){
        signInPage.clicksOnSignInLinkAndSeesHeaderLogInToYourAccount();
    }
}
