package org.example.noveo.locators;

import com.codeborne.selenide.SelenideElement;
import lombok.experimental.UtilityClass;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static org.example.noveo.constants.ProductPageConstants.CLOSE_BUTTON;

@UtilityClass
public class ProductPageLocators {

    public static final SelenideElement addToCartButton = $(By.xpath("//div[@class=\"add\"]//button[@type=\"submit\"]"));

    public static final SelenideElement productSuccessfullyAddedWindow =
            $(By.xpath("//div[@class=\"modal-content\"]//div[@class=\"modal-header\"]//h4[text()=\"Product successfully added to your shopping cart\"]"));

    public static final SelenideElement closeButton =  $(By.xpath("//div[@class=\"modal-content\"]//div[@class=\"modal-header\"]//span//i[@class=\"material-icons\"][text()=\"" + CLOSE_BUTTON +"\"]"));
}
