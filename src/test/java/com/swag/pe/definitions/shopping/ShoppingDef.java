package com.swag.pe.definitions.shopping;

import com.swag.pe.steps.products.SelectProductStep;
import com.swag.pe.steps.validations.ValidationStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class ShoppingDef {

    @Steps(shared = true)
    SelectProductStep selectProduct;

    @Steps(shared = true)
    ValidationStep validate;

    @And("Agrega productos al carrito de compras")
    public void userAddProducts(){
        selectProduct.addProducts(3);
    }

    @And("da click en el icono del carrito")
    public void userClickShoppingCartIcon(){
        selectProduct.ClickShoppingCartIcon();
    }

    @Then("el sistema deberia listar los productos agregados en el carrito de compras")
    public void systemListProdutcs(){
        Assert.assertTrue(validate.productsAreDisplayed());
    }
}
