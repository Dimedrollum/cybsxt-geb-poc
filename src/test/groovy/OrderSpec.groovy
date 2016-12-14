import geb.spock.GebReportingSpec
import page_objects.HomePage
import page_objects.LoginPage
import spock.genesis.Gen

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
        titleCode = "mr"
        firstName = "John"
        lastName = "Smith"
        email = Gen.string(~/[a-z]{10}/).iterator().next() + "@tk.md"
        pwd = "P@ssw0rd"
        checkPwd = "P@ssw0rd"
        registrationForm.register.click()

        then:
        at HomePage
    }

    def "can seatch product"(){
        given:
        to HomePage
    }




}
