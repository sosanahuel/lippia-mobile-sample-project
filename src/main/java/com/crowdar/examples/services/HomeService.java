package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.AddEntryConstants;
import com.crowdar.examples.constants.HomeConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class HomeService extends MobileActionManager {

    public static void clickAddTime() {
        MobileActionManager.waitClickable(HomeConstants.PLUS_BUTTON);
        MobileActionManager.click(HomeConstants.PLUS_BUTTON);
    }

    public static void addTime(String hora, String minutos) {
        setInput(AddEntryConstants.hs_entry, hora, true,true);
        setInput(AddEntryConstants.min_entry, minutos,true,true);
    }

    public static void addDescription(String texto) {
        MobileActionManager.setInput(HomeConstants.INPUT_WORKING, texto, true, false);
    }

    public static void clickAddProject(String project) {
        MobileActionManager.waitVisibility(AddEntryConstants.ADD_PROJECT).click();
        MobileActionManager.waitVisibility(HomeConstants.PROJECTS);

        List<WebElement> Proyectos = MobileActionManager.getElements(HomeConstants.PROJECTS);

        for (WebElement proyecto : Proyectos) {
            if (proyecto.getText().equals(project)) {
                proyecto.click();
            }
        }
    }

    public static void saveTimeEntry() {
        MobileActionManager.waitClickable(HomeConstants.SAVE_BUTTON);
        MobileActionManager.click(HomeConstants.SAVE_BUTTON);
    }

    public static void validarSave(String texto) {
        MobileActionManager.waitClickable(HomeConstants.PLUS_BUTTON);
        Assert.assertEquals(MobileActionManager.getText(HomeConstants.DESCRIPTION_BUTTON).toLowerCase(), texto.toLowerCase());
    }
}
