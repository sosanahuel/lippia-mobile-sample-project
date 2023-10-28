package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.driver.DriverManager;
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
}
