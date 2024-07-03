package org.example.noveo;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.example.noveo.constants.AllureAnnotationConstants.JUNIT;
import static org.example.noveo.constants.AllureAnnotationConstants.SPRING_BOOT_CHECK;

@SpringBootTest
@Feature(SPRING_BOOT_CHECK)
@Tags({@Tag(JUNIT), @Tag(SPRING_BOOT_CHECK)})
class NoveoApplicationTests {

    @Test
    @DisplayName("Проверка запуска Spring Boot")
    void contextLoads() {
    }

}
