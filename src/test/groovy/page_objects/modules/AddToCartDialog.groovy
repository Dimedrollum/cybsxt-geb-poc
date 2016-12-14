package page_objects.modules

import geb.Module

/**
 * Created by dsurchis on 14/12/16.
 */
class AddToCartDialog extends Module {
    static base = { $("#colorbox") }
    static content = {
        checoutCta { $("a.add-to-cart-button") }
    }
}
