package page_objects

import geb.Page
import page_objects.modules.HeaderModule

class HomePage extends Page{
    static url = ""
    static at = { title.endsWith("Homepage") }
    static content = {
        header { module HeaderModule}
    }
}
