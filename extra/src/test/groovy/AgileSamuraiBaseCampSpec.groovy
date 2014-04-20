import geb.spock.GebSpec

class AgileSamuraiBaseCampSpec extends GebSpec {

    def "申し込みボタンを押すとDoorkeeperのページへ遷移する"() {
        given: "Agile Samurai Base Camp へ移動"
        go 'http://www.agilesamuraibasecamp.org'

        expect:
        title == "Agile Samurai Base Camp - ようこそ"

        when: "申し込みボタン"
        def button = $(".wsite-button").first()

        then: "Doorkeeperのページへ移動"
        def actual = withNewWindow({ button.click() }) { [url: browser.driver.currentUrl, title: title] }
        actual.url == "http://agilesamurai-basecamp.doorkeeper.jp/events/9333"
        actual.title == 'Agile Samurai Base Camp 2014 Re:TDD - Agile Samurai Base Camp | Doorkeeper'
    }

}
