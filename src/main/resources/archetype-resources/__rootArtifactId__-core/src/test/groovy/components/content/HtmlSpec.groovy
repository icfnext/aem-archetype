package ${package}.components.content

import com.icfolson.aem.library.models.specs.AemLibraryModelSpec

class HtmlSpec extends AemLibraryModelSpec {

    def setupSpec() {
        pageBuilder.content {
            icfolson {
                "jcr:content" {
                    html(htmlContent: "Test")
                }
            }
        }
    }

    def "get html source"() {
        setup:
        def html = getResource("/content/icfolson/jcr:content/html").adaptTo(Html)

        expect:
        html.htmlContent == "Test"
    }
}
