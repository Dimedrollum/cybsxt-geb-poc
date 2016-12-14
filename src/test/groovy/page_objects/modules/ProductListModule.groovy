package page_objects.modules

import geb.Module

/**
 * Created by dsurchis on 14/12/16.
 */
class ProductListModule extends Module {
    static base = { $("ul.product__listing") }
    static content = {
        products { $("div.product-item")}
    }
}
