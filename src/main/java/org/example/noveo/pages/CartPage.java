package org.example.noveo.pages;

import lombok.RequiredArgsConstructor;
import org.example.noveo.service.PageService;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CartPage {

    private final PageService pageService;


}
