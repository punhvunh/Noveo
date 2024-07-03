package org.example.noveo.locators;

import com.codeborne.selenide.SelenideElement;
import lombok.experimental.UtilityClass;
import org.openqa.selenium.By;

import java.util.Random;

import static com.codeborne.selenide.Selenide.$;
import static org.example.noveo.constants.MainPageConstants.CONTACT_US_LINK;
import static org.example.noveo.constants.MainPageConstants.IFRAME;
import static org.example.noveo.constants.MainPageConstants.POP_UP_MESSAGE;

@UtilityClass
public class MainPageLocators {

    private static final Random random = new Random();

    public static final SelenideElement popUpMessage = $(By.xpath("//div[@id='loadingMessage']//p[text()=\"" + POP_UP_MESSAGE + "\"]"));

    public static final SelenideElement contactUsLink = $(By.xpath("//div[@id=\"contact-link\"]//a[text()=\"" + CONTACT_US_LINK + "\"]"));

    public static final SelenideElement iframe = $(By.xpath("//iframe[@title=\"" + IFRAME + "\"]"));

    public static final SelenideElement contactUsHeader = $(By.xpath("//div[@id=\"content\"]/section//div[@class=\"form-group row\"]//h3[text()=\"" + CONTACT_US_LINK + "\"]"));

    public static final SelenideElement product = $(By.xpath("(//div[@class=\"products row\"]//div[@class=\"thumbnail-top\"])[" + random.nextInt(1,8) + "]"));

    public static final SelenideElement loadSpinner = $(By.xpath("//div[@class=\"loadingMessageWrapper\"]//div//img[@alt=\"loading\"]"));
}
