package page_objects

import geb.Page
import page_objects.modules.AddToCartDialog
import page_objects.modules.AddToCartModule

/**
 * Created by dsurchis on 14/12/16.
 */
class ProductDescriptionPage extends Page{
    static url = "p"
    static at = { $("body.page-productDetails")}
    static content = {
        addToCart { module AddToCartModule}
        addToCartDialog { module AddToCartDialog }
    }
}
