package page_objects.list_items

import geb.Module

/**
 * Created by dsurchis on 14/12/16.
 */
class PlpCell extends Module{
//    static base = { $("div.product-item") }
    static content = {
        picture { $("a.thumb") }
        addToCartCta { $("button", type: "submit")}
    }
}
