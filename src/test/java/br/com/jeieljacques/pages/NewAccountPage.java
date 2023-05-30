package br.com.jeieljacques.pages;

import br.com.jeieljacques.core.Driver;
import br.com.jeieljacques.maps.NewAccountMap;
import org.openqa.selenium.support.PageFactory;

public class NewAccountPage {
    NewAccountMap newAccountMap;

    public NewAccountPage(){
        newAccountMap = new NewAccountMap();
        PageFactory.initElements(Driver.getDriver(), newAccountMap);
    }

    public String getTextNewAccount(){
        Driver.visibilityof(newAccountMap.textCreateAccount);
        return newAccountMap.textCreateAccount.getText();
    }
}
