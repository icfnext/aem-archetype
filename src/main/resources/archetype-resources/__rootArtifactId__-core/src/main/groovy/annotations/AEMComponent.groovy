package ${package}.annotations

import com.citytechinc.cq.component.annotations.Component
import groovy.transform.AnnotationCollector
import org.apache.sling.api.resource.Resource
import org.apache.sling.models.annotations.DefaultInjectionStrategy
import org.apache.sling.models.annotations.Model

@AnnotationCollector
@Component(value = "Component")
@Model(adaptables = Resource, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
@interface AEMComponent{

}
