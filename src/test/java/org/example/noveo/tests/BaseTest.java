package org.example.noveo.tests;

import com.codeborne.selenide.Configuration;
import org.example.noveo.config.BrowserConfigProperties;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static org.example.noveo.constants.AllureAnnotationConstants.JUNIT;
import static org.example.noveo.constants.AllureAnnotationConstants.WEB;

@SpringBootTest
@Tags({@Tag(JUNIT), @Tag(WEB)})
public abstract class BaseTest {

    @Autowired
    private BrowserConfigProperties browserConfigProperties;

    @BeforeEach
    public void setUp() {
        // Configure Selenide settings.
        Configuration.baseUrl = browserConfigProperties.getUrl();
        Configuration.browser = browserConfigProperties.getBrowserName().toLowerCase();
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadTimeout = 15000;
        Configuration.timeout = 15000;

        // Open the browser and navigate to the base URL.
        open("/");
    }

    @AfterEach
    public void tearDown() {
        // Close the browser.
        closeWebDriver();
    }
}
