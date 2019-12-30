package com.serenity.ui;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.facebook.com/")

public class FacebookHomePage extends PageObject {

    public void loginAsAdmin() {

        find(By.id("email")).sendKeys("email"); //put here email of test-user
        find(By.id("pass")).sendKeys("password"); //put here password of test-user

        find(By.id("loginbutton")).click();
    }
}
