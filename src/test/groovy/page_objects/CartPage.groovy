package page_objects

import geb.Page

/**
 * Created by dsurchis on 14/12/16.
 */
class CartPage extends Page {
    static url = "cart"
    static at = { title.startsWith("Your Shopping Bag") }
    static content = {
        checkoutCta(to:CheckoutPage) { $("button.btn--continue-checkout", 0)}
    }
}
