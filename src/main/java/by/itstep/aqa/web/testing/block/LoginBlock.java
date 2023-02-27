package by.itstep.aqa.web.testing.block;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginBlock extends BaseBlock{

    public LoginBlock(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id='index_save_user_checkbox']")
    public WebElement checkboxSaveEnter;

    @FindBy(xpath = "//*[@class='FlatButton FlatButton--primary FlatButton--size-l FlatButton--wide VkIdForm__button VkIdForm__signInButton']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@class='VkIdForm__input']")
    public WebElement loginField;





}
