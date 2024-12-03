package com.swag.pe.utilities.website;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class WebSite {

    @Steps(shared = true)
    PageObject swag;

    @Step("Navegar al sitio web")
    public void navigate(String url){
        swag.setDefaultBaseUrl(url);
        swag.open();
    }
}
