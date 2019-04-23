package ${package}.components.content

import com.citytechinc.cq.component.annotations.DialogField
import com.citytechinc.cq.component.annotations.widgets.TextArea
import com.icfolson.aem.library.core.components.AbstractComponent
import ${package}.annotations.AEMComponent

@AEMComponent("Test Component")
class Html extends AbstractComponent {

    @DialogField(fieldLabel = "HTML")
    @TextArea
    String getHtmlContent() {
        get("htmlContent", "No HTML Defined.")
    }
}
