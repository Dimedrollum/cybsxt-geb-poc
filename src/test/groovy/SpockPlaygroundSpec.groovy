import spock.genesis.Gen
import spock.lang.Specification


/**
 * Created by dsurchis on 14/12/16.
 */
class SpockPlaygroundSpec extends Specification  {

    def "can compare simple math"() {
        expect:
        2 + 2 == 4
    }

    def "can generate email"() {
        given:
        def generatedString = Gen.string(~/[a-z]{10}/).iterator().next()
        expect:
        generatedString == "aa"
    }
}
