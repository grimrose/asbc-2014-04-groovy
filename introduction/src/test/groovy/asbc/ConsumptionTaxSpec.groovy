package asbc

import spock.lang.Specification

/**
 * Created by grimrose on 2014/04/20.
 */
class ConsumptionTaxSpec extends Specification {


    def "デモ"() {
        expect:
        "こんにちは" == "こんばんは"
    }


    def "税率8％で300円の場合、324円が返ってくる"() {
        given:
        def sut = new ConsumptionTax(8)

        when:
        def actual = sut.apply(300)

        then:
        actual == 324

    }

}
