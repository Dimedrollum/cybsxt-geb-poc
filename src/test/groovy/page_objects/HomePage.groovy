package page_objects

import geb.Page

class HomePage extends Page{
    static url = ""
    static at = { title.endsWith("Homepage") }
    static content = {
        signInRegister { $("ul.nav__links--account") }
    }
}
