import geb.Page
import geb.spock.GebSpec

class GoogleHomePage extends Page {
    static url = "https://www.spengergasse.at/"
}

class GebSpikeTest extends GebSpec {

    def "go method does NOT set the page"() {
        given:
        Page oldPage = page

        when:
        go "https://www.spengergasse.at/"

        then:
        oldPage == page
        currentUrl.contains "spengergasse"
    }

    def "to method does set the page and change the current url"() {
        given:
        Page oldPage = page

        when:
        to GoogleHomePage

        then:
        oldPage != page
        currentUrl.contains "spengergasse"
    }
}
