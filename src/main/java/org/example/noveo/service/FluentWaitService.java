package org.example.noveo.service;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

public interface FluentWaitService {

    FluentWait<WebDriver> getFluentWait(int timeoutSeconds);
}
