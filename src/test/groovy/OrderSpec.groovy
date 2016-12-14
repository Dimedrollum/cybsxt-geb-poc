import geb.spock.GebReportingSpec
import page_objects.CartPage
import page_objects.CategoryPage
import page_objects.CheckoutPage
import page_objects.HomePage
import page_objects.LoginPage
import page_objects.ProductDescriptionPage
import page_objects.SearchResultPage
import spock.genesis.Gen

class OrderSpec extends GebReportingSpec{

//    def setup() {
//        resetBrowser()
//        getBrowser()
//    }
//
//    def cleanup() {
//        browser.close()
////        browser.quit()
//    }

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
        def category = "160400"
        to CategoryPage, category

        when:
        productList.products.first().picture.click()

        then:
        at ProductDescriptionPage
    }

    def "can add to cart"() {
        given:
        def productId = "300613859"
        to ProductDescriptionPage, productId

        when:
        addToCart.cta.click()

        then:
        addToCartDialog.displayed

        when:
        addToCartDialog.checoutCta.click()

        then:
        at CartPage
    }

    def "can checkout"() {
        given:
        registeredUser()
        cartWithAProduct()

        when:
        checkoutCta.click()

        then:
        at CheckoutPage
    }

    def "can create Order"(){
        given:
        checkoutForRegisteredUserStarted()

        when:
        countryIso = "GB"
        titleCode = "mr"
        firstName = "John"
        lastName = "Smith"
        line1 = "Address Str. 1"
        townCity = "London"
        postcode = "A9A 9AA"
        shippingCta.click()
        and:
        deliveryMethodCta.click()
        and:
        card_cardType = "001"
        card_accountNumber = "4111111111111111"
        card_expirationMonth = "1"
        card_expirationYear = "2020"
        billingCta.click()




        then:
        1==1

    }

    def checkoutForRegisteredUserStarted() {
        registeredUser()
        cartWithAProduct()
        checkoutCta.click()
        at CheckoutPage
    }

    def registeredUser() {
        to LoginPage
        titleCode = "mr"
        firstName = "John"
        lastName = "Smith"
        email = ++Gen.string(~/[a-z]{10}/).iterator() + "@tk.md"
        pwd = "P@ssw0rd"
        checkPwd = "P@ssw0rd"
        registrationForm.register.click()
        at HomePage
    }

    def cartWithAProduct() {
        def productId = "300613859"
        to ProductDescriptionPage, productId
        addToCart.cta.click()
        addToCartDialog.checoutCta.click()
        at CartPage
    }



}
