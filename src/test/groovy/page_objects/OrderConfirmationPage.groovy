package page_objects

import geb.Page

/**
 * Created by dsurchis on 14/12/16.
 */
class OrderConfirmationPage extends Page {
    static at = { title.trim().startsWith("Order Confirmation")}
}
