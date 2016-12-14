package page_objects.modules

import geb.Module
import page_objects.list_items.PlpCell

/**
 * Created by dsurchis on 14/12/16.
 */
class ProductListModule extends Module {
    static base = { $("*.product__listing") }
    static content = {
        products { $("div.product-item").moduleList(PlpCell) }
    }
}
