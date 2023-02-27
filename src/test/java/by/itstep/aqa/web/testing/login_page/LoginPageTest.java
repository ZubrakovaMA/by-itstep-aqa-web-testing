package by.itstep.aqa.web.testing.login_page;

import by.itstep.aqa.web.testing.base.BaseUITestsClass;
import by.itstep.aqa.web.testing.service.LoginService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;

public class LoginPageTest extends BaseUITestsClass {

    private LoginService loginService = new LoginService(driver);

    @BeforeEach
    public void openLoginPage(){
        driver.navigate().to("https://vk.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(15000));
    }

    @Test
    public void verifyCheckboxSaveEnterVisibility(){
        loginService = new LoginService(driver);

        Assertions.assertTrue(loginService.getLoginPage().getLoginBlock().checkboxSaveEnter.isEnabled());
    }


    @Test
    public void verifyCheckboxSaveEnterIsOn(){
        loginService = new LoginService(driver);

        loginService.getLoginPage().getLoginBlock().checkboxSaveEnter.click();

        Assertions.assertFalse(loginService.getLoginPage().getLoginBlock().checkboxSaveEnter.isSelected());
    }

    @Test
    public void verifyButtonAppStoreLink() {
        loginService = new LoginService(driver);
        String expectedLink = "https://itunes.apple.com/ru/app/id564177498";
        String expectedText = "App Store";

        String actualLink = loginService.getLoginPage().getLoginMobileBlock().buttonAS.getAttribute("href");
        String actualText = loginService.getLoginPage().getLoginMobileBlock().buttonAS.getText();

        Assertions.assertTrue(loginService.getLoginPage().getLoginMobileBlock().buttonAS.isDisplayed());
        Assertions.assertEquals(expectedLink, actualLink);
        Assertions.assertEquals(expectedText, actualText);
    }

    @Test
    public void verifyButtonRuStoreLink() {
        loginService = new LoginService(driver);
        String expectedLink = "https://apps.rustore.ru/app/com.vkontakte.android";
        String expectedText = "RuStore";

        String actualLink = loginService.getLoginPage().getLoginMobileBlock().buttonRS.getAttribute("href");
        String actualText = loginService.getLoginPage().getLoginMobileBlock().buttonRS.getText();


        Assertions.assertTrue(loginService.getLoginPage().getLoginMobileBlock().buttonRS.isDisplayed());
        Assertions.assertEquals(expectedLink, actualLink);
        Assertions.assertEquals(expectedText, actualText);
    }


    @Test
    public void verifyButtonGooglePlayLink() {
        loginService = new LoginService(driver);
        String expectedLink = "https://play.google.com/store/apps/details?id=com.vkontakte.android";
        String expectedText = "Google Play";

        String actualLink = loginService.getLoginPage().getLoginMobileBlock().buttonGP.getAttribute("href");
        String actualText = loginService.getLoginPage().getLoginMobileBlock().buttonGP.getText();

        Assertions.assertTrue(loginService.getLoginPage().getLoginMobileBlock().buttonGP.isDisplayed());
        Assertions.assertEquals(expectedLink, actualLink);
        Assertions.assertEquals(expectedText, actualText);
    }

}
