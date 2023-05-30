package br.com.jeieljacques.steps;

import br.com.jeieljacques.core.Driver;
import br.com.jeieljacques.enums.Browser;
import br.com.jeieljacques.pages.LoginPage;
import br.com.jeieljacques.pages.NewAccountPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.util.Map;

public class LoginSteps {

    LoginPage loginPage;
    @Before
    public void iniciaNavegador(){
        new Driver(Browser.EDGE);
    }
    @After
    public void fechaNavegador(){
        Driver.getDriver().quit();
    }

    @Dado("que a modal esteja sendo exibida")
    public void queAModalEstejaSendoExibida() {
        Driver.getDriver().get("https://advantageonlineshopping.com");
        loginPage = new LoginPage();
        loginPage.clickBtnLogin();
        loginPage.visibilityOfBtnFechar();
        loginPage.aguardaLoader();

    }
    @Quando("for realizado um clique fora da modal")
    public void forRealizadoUmCliqueForaDaModal() {
        loginPage.clickdivFechaModal();

    }
    @Entao("a janela modal deve ser fechada")
    public void aJanelaModalDeveSerFechada() throws Exception {
        try {
            loginPage.invisibilityOfBtnFechar();
        } catch (Exception e){
            throw new Exception("A janela modal não foi fechada");
        }
    }

    @Quando("for realizado um clice no icone fechar modal")
    public void forRealizadoUmCliceNoIconeFecharModal() {
        loginPage.clickBtnFechar();
        
    }

    @Quando("for realizado um clique no link Create New Account")
    public void forRealizadoUmCliqueNoLinkCreateNewAccount() {
        loginPage.clickLinkCreateAccount();
    }

    @Entao("a pagina Create New Account deve ser exibida")
    public void aPaginaCreateNewAccountDeveSerExibida() {
        NewAccountPage newAccountPage = new NewAccountPage();
        Assert.assertEquals("CREATE ACCOUNT", newAccountPage.getTextNewAccount());
    }

    @Quando("os campos de login seja preenchidos da seguinte forma")
    public void osCamposDeLoginSejaPreenchidosDaSeguinteForma(Map<String, String> map) {
        String usuario = map.get("usuario");
        String senha = map.get("senha");
        boolean flag = Boolean.parseBoolean(map.get("flag"));

        loginPage.setInpUserName(usuario);
        loginPage.setInpPassword(senha);
        if(flag) loginPage.clickInpRemember();
    }

    @E("for realizado o clique no botao sign in")
    public void forRealizadoOCliqueNoBotaoSignIn() {
        loginPage.clickBtnSignIn();
    }

    @Entao("deve ser possivel logar no sistema")
    public void deveSerPossivelLogarNoSistema() {
        
    }

    @Entao("o sistema devera exibir uma mensagem de erro")
    public void oSistemaDeveraExibirUmaMensagemDeErro() {
        
    }

    @Entao("o botao sign in deve permancecer desabilitado")
    public void oBotaoSignInDevePermancecerDesabilitado() {
        boolean enabled = loginPage.isBtnSignIn();
        Assert.assertFalse(enabled);
    }
}
