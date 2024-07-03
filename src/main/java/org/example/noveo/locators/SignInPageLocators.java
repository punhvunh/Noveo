package org.example.noveo.locators;

import com.codeborne.selenide.SelenideElement;
import lombok.experimental.UtilityClass;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static org.example.noveo.constants.SingInPageConstants.LOG_IN_TO_YOUR_ACCOUNT_HEADER;

@UtilityClass
public class SignInPageLocators {

    public static final SelenideElement logInToYourAccountHeader =
            $(By.xpath("//div[@class=\"row\"]//section[@id=\"main\"]//h1[contains(text(), \"" + LOG_IN_TO_YOUR_ACCOUNT_HEADER + "\")]"));
}
