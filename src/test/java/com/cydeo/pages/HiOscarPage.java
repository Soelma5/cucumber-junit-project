package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HiOscarPage {

    public HiOscarPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class = 'Button_content__yNdi7']")
    public WebElement searchBtn;

    @FindBy(xpath = "//div[@class = 'Dropdown_visibleContent__NGHUm']")
    public WebElement selectCoverageYear;

    @FindBy(xpath = "//div[@aria-label='2023']")
    public WebElement select2023;

    @FindBy(xpath = "(//div[@class = 'Dropdown_visibleContent__NGHUm'])[2]")
    public WebElement selectCoverageAccess;

    @FindBy(xpath = "//div[text() = 'Employer-provided']")
    public WebElement selectEmployerProvided;

    @FindBy(xpath = "//div[@class = 'AnimatedLabel_label__2Rtyj AnimatedLabel_label_transitionOpacity__165dU AnimatedLabel_label_size-small__2qekg AnimatedLabel_label_theme-contained__35ndF']")
    public WebElement selectNetworkPartner;

    @FindBy(xpath = "//div[text() = 'Oscar']")
    public WebElement selectOscar;

    @FindBy(xpath = "(//div[@class='Dropdown_visibleContent__NGHUm'])[4]")
    public WebElement selectCoverageArea;

    @FindBy(xpath = "//div[@aria-label='New Jersey']")
    public WebElement selectNewJersey;

    @FindBy(xpath = "//button[@class= 'Button_buttonBase__26hAr Button_filled__1Lgot Button_button_primary__1BOBS Button_button_medium__2_2dm NetworkSelector_buttonSubmit__l3NsD']")
    public WebElement continueBtn;
}
