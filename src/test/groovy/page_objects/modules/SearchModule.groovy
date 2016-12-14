package page_objects.modules

import geb.Module
import page_objects.SearchResultPage

/**
 * Created by dsurchis on 14/12/16.
 */
class SearchModule extends Module{
    static base = { $("div.input-group") }

    static content = {
        input { $("input")}
        submit(to: SearchResultPage) { $("button") }
    }
}
