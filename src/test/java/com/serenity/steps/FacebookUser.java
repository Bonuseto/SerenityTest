package com.serenity.steps;

import com.serenity.ui.FacebookHomePage;
import com.serenity.ui.LandingPage;
import net.thucydides.core.annotations.Step;
import static org.assertj.core.api.Assertions.*;

public class FacebookUser {
    private FacebookHomePage facebookHomePage;
    private LandingPage landingPage;

    @Step
    public void isOnTheHomePage() {
        facebookHomePage.open();
    }

    @Step
    public void logsInAsAdmin() {
        facebookHomePage.loginAsAdmin();
    }

    @Step
    public void shouldBeOnLandingPage() {
        assertThat(landingPage.noticeMessage()).isEqualTo("Facebook");
    }
}
