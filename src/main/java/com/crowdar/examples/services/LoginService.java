package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.driver.DriverManager;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.constants.LoginConstants;
import org.testng.Assert;

public class LoginService {

    public static void isViewLoaded(){
        MobileActionManager.waitVisibility(LoginConstants.BUTTON_LOGIN);
        Assert.assertTrue(MobileActionManager.isVisible(LoginConstants.INPUT_EMAIL), LoginConstants.VIEW_NOT_DISPLAYED_MESSAGE);
    }
    public static void logIn(String email, String password) {
        MobileActionManager.setInput(LoginConstants.INPUT_EMAIL, email);
        MobileActionManager.setInput(LoginConstants.INPUT_PASSWORD, password);
        MobileActionManager.click(LoginConstants.BUTTON_LOGIN);
    }

    public static void validarEmail(String email){
        MobileActionManager.waitClickable(LoginConstants.MENU_BUTTON);
        MobileActionManager.click(LoginConstants.MENU_BUTTON);
        MobileActionManager.waitClickable(LoginConstants.USER_EMAIL);
        Assert.assertEquals(MobileActionManager.getText(LoginConstants.USER_EMAIL), email);
    }


    public static void obtengoElPass(){
        String Passw = MobileActionManager.getText(LoginConstants.GET_PASS);
        System.out.println("LA COINTRA ASD:" + Passw);
    }
}
