package org.example.noveo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "properties.browser")
public class BrowserConfigProperties {

    private String browserName;
    private String url;
}
