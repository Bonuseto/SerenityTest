package com.serenity.features.authentication;

import com.serenity.steps.FacebookUser;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.junit.runners.SerenityRunner;

@RunWith(SerenityRunner.class)
public class WhenAuthenticating {
    @Steps
    private FacebookUser user;

    @Managed

    WebDriver browser;//

    @Test
    public void shouldBeAbleToLogin(){
        user.isOnTheHomePage();

        user.logsInAsAdmin();

        user.shouldBeOnLandingPage();
    }
}
