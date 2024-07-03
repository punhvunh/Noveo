package org.example.noveo.service.impl;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.example.noveo.service.FluentWaitService;
import org.example.noveo.service.PageService;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.springframework.stereotype.Service;

import static com.codeborne.selenide.Selenide.switchTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Service
@RequiredArgsConstructor
public class PageServiceImpl implements PageService {

    private final FluentWaitService fluentWaitService;

    @Override
    @Step("Видим элемент {elementName}")
    public SelenideElement elementIsVisible(SelenideElement element, String elementName) {
        return element.shouldBe(Condition.visible);
    }

    @Override
    @Step("Не видим элемент {elementName}")
    public SelenideElement elementIsNotVisible(SelenideElement element, String elementName) {
        return element.shouldBe(Condition.hidden);
    }

    @Override
    @Step("Кликаем на элемент {elementName}")
    public void clicksOnElement(SelenideElement element, String elementName) {
        elementIsVisible(element, elementName).click();
    }

    @Override
    @Step("Ожидаем пока элемент {elementName} появится")
    public void waitUntilElementAppear(SelenideElement element, String elementName, int timeout) {
        FluentWait<WebDriver> fluentWait = fluentWaitService.getFluentWait(timeout);
        fluentWait.until(ExpectedConditions.visibilityOf(element));
    }

    @Override
    @Step("Ожидаем пока элемент {elementName} пропадет")
    public void waitUntilElementDisappear(SelenideElement element, String elementName, int timeout) {
        FluentWait<WebDriver> fluentWait = fluentWaitService.getFluentWait(timeout);
        fluentWait.until(ExpectedConditions.invisibilityOf(element));
    }

    @Override
    @Step("Переключаемся во фрейм {elementName}")
    public void switchesToFrame(SelenideElement element, String elementName) {
        switchTo().frame(element);
    }

    @Override
    @Step("Проверяем видимость и название элемента {elementName}")
    public void checksVisibilityAndNameOfElement(SelenideElement element, String elementName) {
        element.shouldBe(Condition.visible);
        checksNameOfElement(element, elementName);
    }

    @Step("Проверяем название элемента {elementName}")
    private void checksNameOfElement(SelenideElement element, String elementName) {
        String actualName = getsTheTextAttributeValueFromAnElement(element, elementName);
        assertEquals(actualName, elementName);
    }

    @Step("Получаем текстовое содержимого элемента {elementName}")
    private String getsTheTextAttributeValueFromAnElement(SelenideElement element, String elementName) {
        return element.getText();
    }

}
