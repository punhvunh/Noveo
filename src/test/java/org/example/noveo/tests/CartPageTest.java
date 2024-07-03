package org.example.noveo.tests;

import io.qameta.allure.Feature;
import org.example.noveo.pages.CartPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.example.noveo.constants.AllureAnnotationConstants.CART_PAGE;

@Feature(CART_PAGE)
class CartPageTest extends BaseTest {

    @Autowired
    private CartPage cartPage;

    @Test
    @DisplayName("Видим всплывающее окно Product successfully added to your shopping cart после нажатия на кнопку Add to cart")
    void testSeesPopUpWindowProductSuccessfullyAddedToYourShoppingCartAfterClickingOnAddToCartButton() {
        cartPage.seesPopUpWindowProductSuccessfullyAddedToYourShoppingCartAfterClickingOnAddToCartButton();
    }

    @Test
    @DisplayName("Не видим всплывающее окно Product successfully added to your shopping cart после нажатя на кнопку Закрыть")
    void testDoesNotSeePopUpWindowProductSuccessfullyAddedToYourShoppingCartAfterClickingOnCloseButton() {
        cartPage.doesNotSeePopUpWindowProductSuccessfullyAddedToYourShoppingCartAfterClickingOnCloseButton();
    }

}
