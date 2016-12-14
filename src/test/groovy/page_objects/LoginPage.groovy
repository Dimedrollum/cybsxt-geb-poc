package page_objects

import geb.Page
import page_objects.modules.RegisterFormModule

class LoginPage extends Page {
    static url = "login"
    static at = { title.contains("Login") }
    static content = {
        registrationForm { module RegisterFormModule}
    }
}
