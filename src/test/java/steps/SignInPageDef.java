package steps;

import config.UserConfig;
import io.cucumber.java.en.And;
import pages.SignInPage;

public class SignInPageDef {
    SignInPage signInPage = new SignInPage();


    @And("Input login")
    public void inputLogin() {
        signInPage.inputLogin(UserConfig.USER_LOGIN);
    }

    @And("Input password")
    public void inputPassword() {
        signInPage.inputPassword(UserConfig.USER_PASSWORD);
    }
}
