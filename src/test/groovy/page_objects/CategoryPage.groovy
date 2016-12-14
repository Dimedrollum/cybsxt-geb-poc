package page_objects

import geb.Page
import page_objects.modules.HeaderModule
import page_objects.modules.ProductListModule

/**
 * Created by dsurchis on 14/12/16.
 */
class CategoryPage extends Page{
    static url = "c"
    static at = { $("body.pageType-CategoryPage")}
    static content = {
        header { module HeaderModule}
        productList { module ProductListModule}
    }
}
