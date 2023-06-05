package br.com.jeieljacques.pages;

import br.com.jeieljacques.core.Driver;
import br.com.jeieljacques.maps.LoginMap;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    LoginMap loginMap;

    public LoginPage() {
       loginMap = new LoginMap();
        PageFactory.initElements(Driver.getDriver(), loginMap);
    }

    public void clickBtnLogin(){
        Driver.visibilityof(loginMap.btnLogin);
        loginMap.btnLogin.click();
    }

    public void clickBtnFechar(){
        loginMap.btnFechar.click();
    }

    public void clickdivFechaModal(){
        loginMap.divFechaModal.click();
    }

    public void setInpUserName(String username){
        if(username != null){
            loginMap.inpUserName.sendKeys(username);
        }
    }

    public void setInpPassword(String password){
        if (password != null){
            loginMap.inpPassword.sendKeys(password);
        }

    }

    public void clickInpRemember(){
        loginMap.inpRemember.click();
    }

    public void clickLinkCreateAccount(){
        loginMap.linkCreateAccount.click();
    }

    public void clickBtnSignIn(){
        loginMap.btnSignIn.click();
    }

    public boolean isBtnSignIn(){
        return loginMap.btnSignIn.isEnabled();
    }

    public void visibilityOfBtnFechar(){
        Driver.visibilityof(loginMap.btnFechar);
    }

    public void invisibilityOfBtnFechar(){
        Driver.invisibility(loginMap.btnFechar);
    }

    public void aguardaLoader(){
        Driver.attributeChange(loginMap.divLoader, "display", "none");
    }

    public String getUsuarioLogado(){
        Driver.visibilityof(loginMap.textLogado);
        return loginMap.textLogado.getText();
    }

    public String getErroLogin(){
        Driver.visibilityof(loginMap.textErroLogin);
        return loginMap.textErroLogin.getText();
    }
}
