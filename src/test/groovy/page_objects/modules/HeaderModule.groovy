package page_objects.modules

import geb.Module

/**
 * Created by dsurchis on 14/12/16.
 */
class HeaderModule extends Module {

    static content = {
        signInRegister { $("ul.nav__links--account") }
        search { module SearchModule}
    }

}
