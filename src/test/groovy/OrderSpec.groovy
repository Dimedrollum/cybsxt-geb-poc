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
}
