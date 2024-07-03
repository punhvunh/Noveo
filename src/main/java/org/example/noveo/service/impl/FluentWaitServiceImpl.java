package org.example.noveo.service.impl;

import com.codeborne.selenide.WebDriverRunner;
import org.example.noveo.service.FluentWaitService;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.NoSuchElementException;

@Service
public class FluentWaitServiceImpl implements FluentWaitService {

    @Override
    public FluentWait<WebDriver> getFluentWait(int timeoutSeconds) {
        return new FluentWait<>(WebDriverRunner.getWebDriver())
                .withTimeout(Duration.ofSeconds(timeoutSeconds))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
    }
}
