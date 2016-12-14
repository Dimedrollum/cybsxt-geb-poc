package page_objects.modules

import geb.Module
import page_objects.HomePage

/**
 * Created by dsurchis on 14/12/16.
 */
class RegisterFormModule extends Module{
    static base = { $("form#registerForm") }
    static content = {
        register(to: HomePage) { $("button") }
    }
}
