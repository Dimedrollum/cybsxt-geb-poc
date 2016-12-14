package page_objects

import geb.Page

/**
 * Created by dsurchis on 14/12/16.
 */
class CheckoutPage extends Page{
    static url = "checkout"
    static at = { title.trim().startsWith("Checkout")}
    static content = {
        shippingCta  { $("#addressSubmit") }
        deliveryMethodCta { $("#deliveryMethodSubmit")}
        billingCta  { $("button.submit_silentOrderPostForm")}
    }
}
