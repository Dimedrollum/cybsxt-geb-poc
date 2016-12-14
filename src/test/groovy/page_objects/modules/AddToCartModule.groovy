package page_objects.modules

import geb.Module

/**
 * Created by dsurchis on 14/12/16.
 */
class AddToCartModule extends Module {
    static base = { $("div.addtocart-component") }
    static content = {
        qtyInput { $("input.js-qty-selector-input") }
        cta { $("#addToCartButton") }
    }
}
