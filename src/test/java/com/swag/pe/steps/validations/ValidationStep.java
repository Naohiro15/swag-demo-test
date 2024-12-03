package com.swag.pe.steps.validations;

import com.swag.pe.pages.validations.ValidationPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.htmlunit.xpath.operations.Bool;

public class ValidationStep extends ValidationPage {

    @Step("Validar visualizacion del modulo producto")
    public Boolean titleIsVisible(){
        return lbl_product.isDisplayed();
    }

    @Step("Validar visualizacion del mensaje de error")
    public Boolean errorMessageIsDisplayed(){
        return lbl_errorMessage.isDisplayed();
    }

    @Step("Validar los productos listados en el carrito")
    public boolean productsAreDisplayed(){
        for(WebElementFacade product:productsList){
            if(product.isDisplayed()){
                return true;
            }
        }
        return false;
    }
}
