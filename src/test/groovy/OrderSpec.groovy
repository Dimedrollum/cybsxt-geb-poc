import geb.spock.GebReportingSpec
import page_objects.CategoryPage
import page_objects.HomePage
import page_objects.LoginPage
import page_objects.ProductDescriptionPage
import page_objects.SearchResultPage
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
        header.signInRegister.click()

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
        email = ++Gen.string(~/[a-z]{10}/).iterator() + "@tk.md"
        pwd = "P@ssw0rd"
        checkPwd = "P@ssw0rd"
        registrationForm.register.click()

        then:
        at HomePage
    }

    def "can search product"(){
        given:
        to HomePage

        when:
        header.search.input = "abs"
        header.search.submit.click()

        then:
        at SearchResultPage

    }

    def "can open category page"(){
        given:
        def category = "160400"

        when:
        to CategoryPage, category

        then:
        at CategoryPage
    }

    def "can open pdp"() {
        given:
//        def category = "160400"
        to CategoryPage, "160400"

        when:
        productList.products.first().picture.click()

        then:
        at ProductDescriptionPage
    }




}
