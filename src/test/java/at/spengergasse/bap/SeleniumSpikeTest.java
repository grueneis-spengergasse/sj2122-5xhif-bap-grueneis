package at.spengergasse.bap;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;

class SeleniumSpikeTest {

    @Test
    void googleSearchExample() {
        WebDriver driver = new SafariDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            driver.get("https://www.spengergasse.at/");
            assertThat(driver.getCurrentUrl()).contains("spengergasse");
        } finally {
            driver.quit();
        }
    }
}
