package page_objects.modules

import geb.Module

/**
 * Created by dsurchis on 14/12/16.
 */
class RegisterFormModule extends Module{
    static base = { $("form#registerForm") }
}
