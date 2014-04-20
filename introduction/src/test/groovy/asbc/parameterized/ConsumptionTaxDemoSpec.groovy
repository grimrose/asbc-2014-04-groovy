package asbc.parameterized

import asbc.ConsumptionTax
import spock.lang.Specification
import spock.lang.Unroll

class ConsumptionTaxDemoSpec extends Specification {

    @Unroll
    def "税率#rate%で、#price円の場合、#expect円が返ってくること"() {
        given:
        def sut = new ConsumptionTax(rate)

        expect:
        expect == sut.apply(price)

        where:
        rate | price || expect
        5  | 100  || 105
        5  | 3000 || 3150
        10 | 50   || 55
        5  | 50   || 52
        3  | 50   || 52
    }

}
