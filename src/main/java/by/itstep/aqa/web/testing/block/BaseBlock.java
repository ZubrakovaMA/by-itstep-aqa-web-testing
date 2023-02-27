package by.itstep.aqa.web.testing.block;

import org.openqa.selenium.WebDriver;

public class BaseBlock {
    protected WebDriver driver;

    public BaseBlock(WebDriver driver){
        this.driver = driver;
    }
}
