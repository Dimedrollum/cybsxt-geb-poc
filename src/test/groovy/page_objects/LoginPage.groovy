package page_objects

import geb.Page

class LoginPage extends Page {
    static url = "login"
    static at = { title.contains("Login") }
}
