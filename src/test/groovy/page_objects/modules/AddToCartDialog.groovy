package page_objects.modules

import geb.Module
import page_objects.CartPage

/**
 * Created by dsurchis on 14/12/16.
 */
class AddToCartDialog extends Module {
    static base = { $("#colorbox") }
    static content = {
        checoutCta(to:CartPage) { $("a.add-to-cart-button") }
    }
}
