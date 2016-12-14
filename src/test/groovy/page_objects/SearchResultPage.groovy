package page_objects

import geb.Page
import page_objects.modules.HeaderModule
import page_objects.modules.ProductListModule

/**
 * Created by dsurchis on 14/12/16.
 */
class SearchResultPage extends Page{
    static at = { title.startsWith("Search") }
    static content = {
        header { module HeaderModule}
        productList { module ProductListModule}
    }
}
