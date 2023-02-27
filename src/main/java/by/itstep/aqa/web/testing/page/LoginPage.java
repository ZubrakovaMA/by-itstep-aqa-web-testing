package by.itstep.aqa.web.testing.page;

import by.itstep.aqa.web.testing.block.LoginBlock;
import by.itstep.aqa.web.testing.block.LoginMobileBlock;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private LoginBlock loginBlock = new LoginBlock(driver);
    private LoginMobileBlock loginMobileBlock = new LoginMobileBlock(driver);

    public LoginPage(WebDriver driver){
        super(driver);
    }

    public LoginBlock getLoginBlock() {
        return loginBlock;
    }

    public LoginMobileBlock getLoginMobileBlock() {
        return loginMobileBlock;
    }
}
