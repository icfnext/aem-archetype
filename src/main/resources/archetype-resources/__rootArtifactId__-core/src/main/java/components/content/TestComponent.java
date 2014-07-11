package ${package}.components.content;

import com.citytechinc.cq.component.annotations.Component;
import com.citytechinc.cq.component.annotations.DialogField;
import com.citytechinc.aem.bedrock.core.components.AbstractComponent;

@Component("Test Component")
public class TestComponent extends AbstractComponent {

	@DialogField(fieldLabel = "Test Title", fieldDescription = "Our title")
	public String getTitle() {
		return get("title", "");
	}

}
