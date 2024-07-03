package org.example.noveo.service;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;

public interface PageService {

    WebElement elementIsVisible(SelenideElement element, String elementName);

    SelenideElement elementIsNotVisible(SelenideElement element, String elementName);

    void clicksOnElement(SelenideElement element, String elementName);

    void waitUntilElementAppear(SelenideElement element, String elementName, int timeout);

    void waitUntilElementDisappear(SelenideElement element, String elementName, int timeout);

    void switchesToFrame(SelenideElement element, String elementName);

    void checksVisibilityAndNameOfElement(SelenideElement element, String elementName);

    void checksTheNumberOfSameElements(String element, int expectedCount, String elementName);

    void waitUntilPopUpMessageDisappearsAndSwitchesToIframe();
}
