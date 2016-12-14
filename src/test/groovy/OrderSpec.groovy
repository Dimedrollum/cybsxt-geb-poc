import geb.spock.GebReportingSpec
import page_objects.HomePage
import page_objects.LoginPage

class OrderSpec extends GebReportingSpec{

    def "can open home page"() {
        when:
        to HomePage
        then:
        at HomePage

    }

    def "can start registration"() {
        given:
        to HomePage

        when:
        signInRegister.click()

        then:
        at LoginPage
    }

    def "can register"() {
        given:
        to LoginPage
        when:
        registrationForm.titleCode = "mr"
        registrationForm.firstName = "John"
        registrationForm.lastName = "Smith"
        registrationForm.email = "test@tk.md"
        registrationForm.pwd = "P@ssw0rd"
        registrationForm.checkPwd = "P@ssw0rd"


        then:
        $("form#registerForm").titleCode == "mr"

    }

}
