package by.itstep.aqa.web.testing.service;

import org.openqa.selenium.WebDriver;

public class BaseService {
    protected WebDriver driver;

    public BaseService (WebDriver driver){
        this.driver = driver;
    }
}
