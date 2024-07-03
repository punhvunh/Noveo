package org.example.noveo.pages;

import io.qameta.allure.Step;
import lombok.RequiredArgsConstructor;
import org.example.noveo.service.PageService;
import org.springframework.stereotype.Component;

import static org.example.noveo.constants.MainPageConstants.PRODUCT;
import static org.example.noveo.constants.ProductPageConstants.ADD_TO_CART_BUTTON;
import static org.example.noveo.constants.ProductPageConstants.CLOSE_BUTTON;
import static org.example.noveo.constants.ProductPageConstants.PRODUCT_SUCCESSFULLY_ADDED_WINDOW;
import static org.example.noveo.locators.MainPageLocators.product;
import static org.example.noveo.locators.ProductPageLocators.addToCartButton;
import static org.example.noveo.locators.ProductPageLocators.closeButton;
import static org.example.noveo.locators.ProductPageLocators.productSuccessfullyAddedWindow;

@Component
@RequiredArgsConstructor
public class CartPage {

    private final PageService pageService;

    @Step("Видим всплывающее окно Product successfully added to your shopping cart после нажатия на кнопку Add to cart")
    public void seesPopUpWindowProductSuccessfullyAddedToYourShoppingCartAfterClickingOnAddToCartButton() {
        pageService.waitUntilPopUpMessageDisappearsAndSwitchesToIframe();
        pageService.clicksOnElement(product, PRODUCT);
        pageService.clicksOnElement(addToCartButton, ADD_TO_CART_BUTTON);
        pageService.checksVisibilityAndNameOfElement(productSuccessfullyAddedWindow, PRODUCT_SUCCESSFULLY_ADDED_WINDOW);
    }

    @Step("Не видим всплывающее окно Product successfully added to your shopping cart после нажатя на кнопку Закрыть")
    public void doesNotSeePopUpWindowProductSuccessfullyAddedToYourShoppingCartAfterClickingOnCloseButton() {
        seesPopUpWindowProductSuccessfullyAddedToYourShoppingCartAfterClickingOnAddToCartButton();
        pageService.clicksOnElement(closeButton, CLOSE_BUTTON);
        pageService.elementIsNotVisible(productSuccessfullyAddedWindow, PRODUCT_SUCCESSFULLY_ADDED_WINDOW);
    }

}
